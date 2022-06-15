import java.util.ArrayList;
import java.util.Arrays;

public class arrayTest {
 public static void main(String[] args) {
    // declare an array using 'new' keyword
    Integer[] dataList = new Integer[10];
    // Insert data
    dataList[0] = 1;
    System.out.println(dataList[0]);

    // Initialize array inserting data at the same time
    Integer dataList1[] = {5,4,3,2,1};
    System.out.println(dataList1[0]);
    Integer[] dataList2 = {1,2,3,4,5};
    System.out.println(dataList2[0]);

    // java.util.Arrays
    // Arrays.toString : print array
    System.out.println(Arrays.toString(dataList2));

    /*
     * Array: Length limited. Length decided when initiated.
     * 
     * difference of initiating List and ArrayList
     * List<Integer> list1 = new ArrayList<Integer>();
     * ArrayList<Integer> list2 = new ArrayList<Integer>();
     * Also possible to initiate an array omitting its type from JDK1.7
     * ArrayList<Integer> list3 = new ArrayList<>();
     * 
     * List: Interface
     * - If I declare an arrayList using List Interface,
     * - I will be able to switch the type of data from array to LinkedList when needed
     * - Because, ArrayList and LinkedList has inheritted same List Interface
     * ArrayList: Length is changeable. It is a Class
     */
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    // Insert data
    list1.add(1);
    list1.add(2);
    // Find data
    System.out.println(list1.get(0));
    // Change data
    list1.set(0,5);
    System.out.println(list1.get(0));
    // Remove data
    list1.remove(0);
    System.out.println(list1.get(0));
    // Length of arrayList
    System.out.println(list1.size());

    // Multidementional Array
    // 2D array
    Integer dataList3[][] = {{1,2,3},{4,5,6}};
    System.out.println(dataList3[0][1]);
    System.out.println(dataList3[1][2]);
    // 3D array
    Integer[][][] dataList4 = {
        {
            {1,2,3},
            {4,5,6}
        },
        {
            {7,8,9},
            {10,11,12}
        }
    };
    System.out.println(dataList4[0][1][1]);
    System.out.println(dataList4[1][1][2]);
    System.out.println(dataList4[1][0][1]);
    System.out.println(dataList4[1][1][0]);
    System.out.println(dataList4[0][0][1]);

    String dataSet[] = {
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen",
        "Todoroff, Mr. Lalio"
    };

    Integer count = 0;
    for(String name : dataSet){
        if(name.indexOf('M') >= 0){
            count++;
        }
    }

    for (Integer item=0; item < dataSet.length; item++) {
        if (dataSet[item].indexOf("M") >= 0) {   
         count++;
        }  
    }
    System.out.println(count);
 }
}