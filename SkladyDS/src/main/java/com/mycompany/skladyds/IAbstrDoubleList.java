package com.mycompany.skladyds;

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

    /**
     * Zpristupni prvni prvek seznamu a presune na nej ukazatel aktualniho prvku.
     *
     * @return data prvniho prvku
     * @throws NoSuchElementException pokud je seznam prazdny
     */
    T zpristupniPrvni();

    /**
     * Zpristupni posledni prvek seznamu a presune na nej ukazatel aktualniho prvku.
     *
     * @return data posledniho prvku
     * @throws NoSuchElementException pokud je seznam prazdny
     */
    T zpristupniPosledni();

    /**
     * Zpristupni naslednika aktualniho prvku a presune na nej ukazatel aktualniho prvku.
     *
     * @return data naslednika aktualniho prvku
     * @throws NoSuchElementException pokud aktualni prvek nema naslednika
     *                                nebo seznam je prazdny
     */
    T zpristupniNaslednika();

    /**
     * Zpristupni predchudce aktualniho prvku a presune na nej ukazatel aktualniho prvku.
     *
     * @return data predchudce aktualniho prvku
     * @throws NoSuchElementException pokud aktualni prvek nema predchudce
     *                                nebo seznam je prazdny
     */
    T zpristupniPredchudce();

    // --- Odebirani prvku ----------------------------------------------------

    /**
     * Odebere aktualni prvek ze seznamu.
     * Po odebrání je ukazatel aktualniho prvku nastaven na prvni prvek seznamu.
     *
     * @return data odebraneho prvku
     * @throws NoSuchElementException pokud neni nastaven aktualni prvek
     */
    T odeberAktualni();

    /**
     * Odebere prvni prvek ze seznamu.
     * Pokud byl prvni prvek zaroven aktualnim, aktualni se nastavi na novy prvni prvek.
     *
     * @return data odebraneho prvku
     * @throws NoSuchElementException pokud je seznam prazdny
     */
    T odeberPrvni();

    /**
     * Odebere posledni prvek ze seznamu.
     * Pokud byl posledni prvek zaroven aktualnim, aktualni se nastavi na prvni prvek.
     *
     * @return data odebraneho prvku
     * @throws NoSuchElementException pokud je seznam prazdny
     */
    T odeberPosledni();

    /**
     * Odebere naslednika aktualniho prvku ze seznamu.
     * Aktualni prvek zustava nezmennen.
     *
     * @return data odebraneho prvku
     * @throws NoSuchElementException pokud aktualni prvek nema naslednika
     *                                nebo seznam je prazdny
     */
    T odeberNaslednika();

    /**
     * Odebere predchudce aktualniho prvku ze seznamu.
     * Aktualni prvek zustava nezmennen.
     *
     * @return data odebraneho prvku
     * @throws NoSuchElementException pokud aktualni prvek nema predchudce
     *                                nebo seznam je prazdny
     */
    T odeberPredchudce();

    // --- Iterator -----------------------------------------------------------

    /**
     * Vytvori iterator prochazejici seznam od prvniho do posledniho prvku.
     * Vyzadovano rozhranim Iterable.
     *
     * @return iterator pres vsechny prvky seznamu
     */
    @Override
    Iterator<T> iterator();
}
