package visitors;

import concretas.Student;
import interfaces.IElement;
import interfaces.Visitor;

public class StudentVisitor extends Visitor {
    private int qtdAlunos;
    private float totalNotas;
    
    @Override
    public void visitStudent(Student element) {
        totalNotas += element.getNota();
        ++qtdAlunos;
    }
    
    public float mediaNotas() {
        return totalNotas / qtdAlunos;
    }
    
    @Override
    public String toString() {
        return "Media de todas as notas: " + mediaNotas();
    }
}
