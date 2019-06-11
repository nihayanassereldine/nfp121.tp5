package question2;

import java.util.*;

public class Memento
{
    private List<String> etats;
    
    public Memento(List<String> et)
    {
        etats=et;
    }
    
    public List<String> getState()
    {
        return etats;
    }

}
