package question1;

import java.util.*;

public class Ensemble< T > extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

   
    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        // à compléter pour la question1-1
        if(!table.contains(t))
       {
           if(table.add(t)) return true;
           return false;
       }
       return false;
       
       /**
          si on utilise la methode add(Object o) fait une addition une objet
            meme s il est collection fait une addition d un collection
            par effet size du vecteur augmente 1
          
          si on utilise la methode addAll(Collection c)
            fait une addition les continues du collection objet par objet
            par effet size du vecteur augmente size du collection
       */
    }
    
    public java.util.Vector<T> getTable()
    {
        return table;
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> temp = new Ensemble<T>();
        Iterator it = e.iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            if(!table.contains(obj)) temp.add((T)obj);
            
        }
        temp.addAll(table);
        return temp;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2

        Ensemble<T> temp = new Ensemble<T>();
       Iterator it = e.iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            if(table.contains(obj)) temp.add((T)obj);
           
        }
        
        return temp;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> temp = new Ensemble<T>();
        Iterator it = iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            if(!e.contains(obj)) temp.add((T)obj);
         
        }
        
        return temp;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        // ((e union e1) - (e inter e1))
        Ensemble<T> temp = new Ensemble<T>();
        Ensemble<T> temp1 = union(e);
        Ensemble<T> temp2 = inter(e);
       
        temp.addAll(temp1);
        temp.removeAll(temp2);
        
        return temp;
    }
    
  
}
