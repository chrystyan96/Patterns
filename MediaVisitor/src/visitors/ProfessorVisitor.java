package visitors;

import concretas.Professor;
import interfaces.IElement;
import interfaces.Visitor;

public class ProfessorVisitor extends Visitor {
    private int totalArticles;
    private int totalProfessores;
    
    @Override
    public void visitProfessor(Professor element) {
        totalArticles += element.getQtdArticles();
        ++totalProfessores;
    }
    
    public int mediaArticles() {
        return totalArticles / totalProfessores;
    }
    
    @Override
    public String toString() {
        return "Quantidade de artigos: " + mediaArticles();
    }
}
