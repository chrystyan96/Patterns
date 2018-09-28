package calculatorcommand.interfaces;

public interface ICommand {
    public void execute();
    public void unexecute();
    public void calculate(String operation, int value1, int value2);
    public int getResult();
    public int getValue1();
    public int getValue2();
}
