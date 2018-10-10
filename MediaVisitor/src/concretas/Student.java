package concretas;

import interfaces.IElement;
import interfaces.Visitor;

public class Student implements IElement{
    private float nota;
    
    public Student (float nota) {
        this.nota = nota;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
    
    public float getNota() {
        return nota;
    }
}
