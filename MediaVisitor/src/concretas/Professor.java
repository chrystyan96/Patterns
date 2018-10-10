package concretas;

import interfaces.IElement;
import interfaces.Visitor;

public class Professor implements IElement {
    private int qtdArticles;
    
    public Professor(int qtd) {
        qtdArticles = qtd;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProfessor(this);
    }
    
    public int getQtdArticles() {
        return qtdArticles;
    }
}
