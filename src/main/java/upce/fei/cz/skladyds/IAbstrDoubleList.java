package upce.fei.cz.skladyds;

import java.util.Iterator;
import java.util.NoSuchElementException;


public interface IAbstrDoubleList<T> extends Iterable<T> {

    // --- Zakladni operace ---------------------------------------------------

    /**
     * Zrusi cely seznam - odstrani vsechny uzly a uvolni jejich reference.
     * Po zavolani je seznam prazdny, ukazatel na prvni i aktualni prvek
     * je nastaven na null.
     */
    void zrus();

    /**
     * Overi, zda je seznam prazdny (neobsahuje zadny uzel).
     *
     * @return true pokud seznam neobsahuje zadny prvek, jinak false
     */
    boolean jePrazdny();

    // --- Vkladani prvku -----------------------------------------------------

    /**
     * Vlozi novy prvek na prvni misto seznamu.
     * Novy uzel se stane predchudcem dosavadniho prvniho uzlu.
     * Aktualni prvek zustava nezmennen.
     *
     * @param data data vkladaneho prvku
     * @throws IllegalArgumentException pokud je data null
     */
    void vlozPrvni(T data);

    /**
     * Vlozi novy prvek na posledni misto seznamu.
     * Novy uzel se stane naslednikem dosavadniho posledniho uzlu.
     * Aktualni prvek zustava nezmennen.
     *
     * @param data data vkladaneho prvku
     * @throws IllegalArgumentException pokud je data null
     */
    void vlozPosledni(T data);

    /**
     * Vlozi novy prvek jako naslednika aktualniho prvku.
     * Novy uzel je zarazen bezprostredne za aktualni uzel.
     * Aktualni prvek zustava nezmennen.
     *
     * @param data data vkladaneho prvku
     * @throws IllegalArgumentException pokud je data null
     * @throws NoSuchElementException   pokud neni nastaven aktualni prvek
     */
    void vlozNaslednika(T data);

    /**
     * Vlozi novy prvek jako predchudce aktualniho prvku.
     * Novy uzel je zarazen bezprostredne pred aktualni uzel.
     * Aktualni prvek zustava nezmennen.
     *
     * @param data data vkladaneho prvku
     * @throws IllegalArgumentException pokud je data null
     * @throws NoSuchElementException   pokud neni nastaven aktualni prvek
     */
    void vlozPredchudce(T data);

    // --- Zpristupnovani prvku -----------------------------------------------

    /**
     * Zpristupni aktualni prvek seznamu.
     * Ukazatel aktualniho prvku zustane na stejnem uzlu.
     *
     * @return data aktualniho prvku
     * @throws NoSuchElementException pokud neni nastaven aktualni prvek
     */
    T zpristupniAktualni();

    T zpristupniPrvni();

    T zpristupniPosledni();

    T zpristupniNaslednika();

    T zpristupniPredchudce();

    T odeberAktualni();

    T odeberPrvni();

    T odeberPosledni();

    T odeberNaslednika();

    T odeberPredchudce();
    
    @Override
    Iterator<T> iterator();
}
