

public class ProbarAVLTree {

    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree arbolAVL = new AVLTree();

        Integer elemento1 = new Integer(5);
        Integer elemento2 = new Integer(3);
        Integer elemento3 = new Integer(1);
        Integer elemento4 = new Integer(4);
        Integer elemento5 = new Integer(2);
        Integer elemento6 = new Integer(6);
        Integer elemento7 = new Integer(8);
        Integer elemento8 = new Integer(13);
        Integer elemento9 = new Integer(14);
        Integer elemento10 = new Integer(10);
        Integer elemento11 = new Integer(11);
        Integer elemento12 = new Integer(16);
        Integer elemento13 = new Integer(15);
     
        arbolAVL.insert(elemento1);
        arbolAVL.insert(elemento2);
        arbolAVL.insert(elemento3);
        arbolAVL.insert(elemento4);
        arbolAVL.insert(elemento5);
        arbolAVL.insert(elemento6);
        arbolAVL.insert(elemento7);
        arbolAVL.insert(elemento8);
        arbolAVL.insert(elemento9);
        arbolAVL.insert(elemento10);
        arbolAVL.insert(elemento11);
        arbolAVL.insert(elemento12);
        arbolAVL.insert(elemento13);
        arbolAVL.imprimirPorNiveles();
        System.out.println("\n");

        

    }

}
