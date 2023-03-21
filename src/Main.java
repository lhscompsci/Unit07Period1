import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> listOfNums = new ArrayList<>();
        System.out.println(listOfNums);
        listOfNums.add(27);
        listOfNums.add(32);
        listOfNums.add(-12);
        listOfNums.add(1,512);
        listOfNums.add(27);
        listOfNums.remove(3);
        listOfNums.remove(new Integer(27));
        System.out.println(listOfNums.contains(27));
        System.out.println(listOfNums);
        System.out.println(listOfNums.set(1,973));
        System.out.println(listOfNums.size());
        Collections.sort(listOfNums);
        System.out.println(listOfNums);
        System.out.println(listOfNums.get(2));
        for (int i = 0; i < listOfNums.size();i++){
            listOfNums.set(i,listOfNums.get(i)+52);
        }
        for(int item:listOfNums){
            item += 52;
        }
        System.out.println(listOfNums);


    }
}