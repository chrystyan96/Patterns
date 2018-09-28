package calculatorcommand.calculator;

import calculatorcommand.interfaces.ICommand;
import java.util.Stack;

public class Command implements ICommand{
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private Stack<Integer> undo;
    private Stack<Integer> redo;
    
    public Command() {
        calculator = new Calculator();
        undo = new Stack<Integer>();
        redo = new Stack<Integer>();
        value1 = 0;
        value2 = 0;
        result = 0;
    }

    @Override
    public void execute() {
        if(!redo.empty()) {
            undo.push(getValue1());
            undo.push(getValue2());
            undo.push(getResult());
            
            result = redo.peek();
            redo.pop();
            value2 = redo.peek();
            redo.pop();
            value1 = redo.peek();
            redo.pop();
        }
    }

    @Override
    public void unexecute() {
        if(!undo.empty()) {
            redo.push(getValue1());
            redo.push(getValue2());
            redo.push(getResult());
            if(undo.size()> 3) {
                result = undo.peek();
                undo.pop();
                value2 = undo.peek();
                undo.pop();
                value1 = undo.peek();
                undo.pop();
            } else {
                value2 = undo.peek();
                value1 = undo.peek();
                result = undo.peek();
            }
        }
    }

    @Override
    public void calculate(String operation, int val1, int val2) {
        undo.push(value1);
        undo.push(value2);
        undo.push(result);
        this.value1 = val1;
        this.value2 = val2;
        System.out.println(this.value1);
        System.out.println(this.value2);
        switch (operation) {
            case "+": 
                result = calculator.sum(val1, val2);
                break;
            case "-":
                result = calculator.sub(val1, val2);
                break;
            case "*":
                result = calculator.mul(val1, val2);
                break;
            case "/":
                result = calculator.div(val1, val2);
                break;
        }
    }
    
    public int getResult() {
        return result;
    }
    
    public int getValue1() {
        return value1;
    }
    
    public int getValue2() {
        return value2;
    }
}
