package collection;

public class implement {

	public static void main(String[] args) {
		data<Integer> list = new data<>();
		    list.add(0);
	        list.add(2);
	        list.add(3);
	        list.add(1);
	        list.add(5);
	        System.out.println(list);
	        list.remove(2);
	        System.out.println(list);
	        list.remove(3);
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	        System.out.println(list.size());
	}

}