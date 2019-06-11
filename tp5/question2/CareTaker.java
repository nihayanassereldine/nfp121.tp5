package question2;

import java.util.*;

public class CareTaker
{
    private Stack<Memento> etat = new Stack<Memento>();
    
    public void addMemento(Memento mem)
    {
        etat.push(mem);
    }
    
    public Memento getMemento()
    {
        return etat.pop();
    }
    
    public boolean isEmpty()
    {
        return etat.empty();
    }
}
