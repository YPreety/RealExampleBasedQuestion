package ProblemWithSolutions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*List<Integer> list=Arrays.asList(1,2,3,4,5,6); 
Iterator it=list.iterator(); 
while(it.hasNext()){ 
System.out.println(it.next()); 
} 
The above code will iterate sequentially through 1 to 6. Can we iterate the same list alternatively 
so that it will print 1,3,5 without changing the while loop.
*/
public class Question5 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

		Iterator<Integer> iterator = intList.iterator();
		int i = 1;
		while (iterator.hasNext()) {
			if (i % 2 != 0) {
				System.out.println((Integer) iterator.next());
			} else
				iterator.next();
			i++;
		}

	}

}
