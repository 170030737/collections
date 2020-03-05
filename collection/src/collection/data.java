package collection;

import java.util.Arrays;

public class data <lis> {
	private int size=0;
	private static final int VOL=10;
	private Object list_elemt[];
	public data()
	{
        list_elemt = new Object[VOL];
    }
	public void add(lis data)
	{
		if (size == list_elemt.length) {
            ensurevol();
        }
		list_elemt[size++]=data;
	}
	public int size()
	{
		return size;
	}
//	public lis remove(int i)
//	{
//		if (i >= size || i < 0) {
//            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
//        }
//		 Object list_item = list_elements[i];
//	        int num_of_Elts = list_elements.length - ( i + 1 ) ;
//	        System.arraycopy( list_elements, i + 1, list_elements, i, num_of_Elts ) ;
//	        size--;
//	        return (lis) list_item;
//	}
	public lis remove(int i)
	{
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }

		Object list_item = list_elemt[i];
	        int no_of_Elemt = list_elemt.length - ( i + 1 ) ;
	        System.arraycopy( list_elemt, i + 1, list_elemt, i, no_of_Elemt ) ;
	        size--;
	        return (lis) list_item;
	}
	public lis get(int i) {
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (lis) list_elemt[i];
    }
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(list_elemt[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
	private void ensurevol() {
        int newSize = list_elemt.length * 2;
        list_elemt = Arrays.copyOf(list_elemt, newSize);
    }
}