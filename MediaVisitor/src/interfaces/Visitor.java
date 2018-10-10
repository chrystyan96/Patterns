package interfaces;

import concretas.Professor;
import concretas.Student;

public class Visitor {
    public void visitStudent(Student element) {
        
    }
    
    public void visitProfessor(Professor element) {
       
    }
    
    @Override
    public String toString() {
        return "";
    }
}
