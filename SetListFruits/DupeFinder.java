package SetListFruits;

import java.util.*;

public class DupeFinder<E extends Comparable<E>> { /* Objeto que implemente comparable. Porque aqui vamos ter metodos +
    que obriga que os objetos implementem comparable*/

    private Collection<E> collectionToCheck;

    public DupeFinder(Collection<E> collectionToCheck) {

        this.collectionToCheck = collectionToCheck;
    }

    public int checkDupes() {
        Set<E> singleObjects = new HashSet<>(collectionToCheck);
        return collectionToCheck.size() - singleObjects.size();
    }

    public List<E> getDupes() {
        Set<E> singleObjects = new HashSet<>(collectionToCheck);
        List<E> list = new ArrayList<>(collectionToCheck);

        for (E value : singleObjects) {
            list.remove(value);
        }
        return list;
    }

    public List<E> sortedDupes(){
        List<E> list = getDupes();

        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}
