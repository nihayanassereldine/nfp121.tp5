package question2;

import java.util.*;


public class Originator
{
   private List<String> etats;

    public void set(List<String> et) {

        this.etats = et;
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.etats);
    }

    public List<String> getFromMemento(Memento memento) {
        this.etats = memento.getState();
        return etats;
    }
}
