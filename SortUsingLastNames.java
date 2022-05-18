import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingLastNames {

 public void sortLast(ArrayList<String> al) {
     System.out.println(al);
    Collections.sort(al, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            String[] split1 = o1.split(" ");
            String[] split2 = o2.split(" ");
            String lastName1 = split1[1];
            String lastName2 = split2[1];
                if (lastName1.compareTo(lastName2) > 0) {
                    return 1;
                } else if (lastName1.compareTo(lastName2) < 0){
                    return -1;
                }
                return 0;
        }
    });
    System.out.println(al);
 }

 public static void main(String[] args) {
//  ArrayList<String> al = new ArrayList<String>();
//  al.add("Daenerys Targaryen");
//  al.add("Jon Show");
//  al.add("Tyrion Lannister");
//  al.add("Joffrey Baratheon");
 ArrayList<String> al = new ArrayList<String>(Arrays.asList("Daenerys Targaryen", "Amy Adams", "Jon Snow", "Tyrion Lannister", "Beatle Juice", "Joffrey Baratheon"));
 SortUsingLastNames i = new SortUsingLastNames();
 System.out.println("Sorted using Last Name");
 i.sortLast(al);
 }

}