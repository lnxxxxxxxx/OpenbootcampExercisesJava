package co.packg;


import java.util.Vector;

public class VT {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);
    }
}
