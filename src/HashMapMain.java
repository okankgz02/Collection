
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class HashMapMain {

    /*
    HashMap Sınıfı
    
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık
    gelen bir tane değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
    
    
    
    */
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        hashMap.put(20, "Php");

        hashMap.put(50, "Javascript");


        // System.out.println(list);
        System.out.println(hashMap); //{50=Javascript, 20=Php, 10=Java, 30=Python}

        System.out.println(hashMap.get(50));  // Javascript

        System.out.println(hashMap.get(10)); //Java
        System.out.println(hashMap.get(100)); //null

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

            System.out.println("Anahtar : " + entry.getKey() + " ------> Değer: " + entry.getValue());
        }

        /* null
Anahtar : 50 ------> Değer: Javascript
Anahtar : 20 ------> Değer: Php
Anahtar : 10 ------> Değer: Java
Anahtar : 30 ------> Değer: Python
*/


    }
}
