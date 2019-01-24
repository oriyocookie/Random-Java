//Oriyo Chakma
//200338214


import java.util.*;

public class Exercise1a {

    public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<>();

	list.add(14);

	list.add(24);

	list.add(14);

	list.add(42);

	list.add(25);

	ArrayList<Integer> newList = removeDuplicates(list);

	System.out.println(newList);

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
	ArrayList<E> newArray = list;
	for (int i = 0; i<newArray.size(); i++) {
	    for (int j = i+1; j<newArray.size(); j++) {
		if (newArray.get(i) == newArray.get(j)) {
		    newArray.remove(j);
		}
	    }
	}
	return newArray;
    }   
}
