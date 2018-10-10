package main;


import concretas.Professor;
import concretas.Student;
import interfaces.IElement;
import interfaces.Visitor;
import java.util.ArrayList;
import visitors.ProfessorVisitor;
import visitors.StudentVisitor;

public class main {
    public static void main(String[] args) {
        ArrayList<IElement> element = new ArrayList<>();
        ArrayList<Visitor> visitor = new ArrayList<>();
        
        visitor.add(new ProfessorVisitor());
        visitor.add(new StudentVisitor());
        
        element.add(new Student(7.5f));
        element.add(new Student(3.6f));
        element.add(new Student(6.1f));
        
        element.add(new Professor(15));
        element.add(new Professor(5));
        element.add(new Professor(7));
        
        for(IElement elemento : element) {
            for(Visitor v : visitor) {
                elemento.accept(v);
            }
        }
        
        for(Visitor v : visitor) {
            System.out.println(v.toString());
        }
    }
}
