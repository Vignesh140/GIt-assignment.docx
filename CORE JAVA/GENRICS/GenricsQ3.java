class Generic<T>
{
	public T[] swap(T[] a, int i, int j) 
	{
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class GenricsQ3 
{
	


public static void main(String[] args) 
{
	Integer arr[] = {10,20,30,40,50,60,70,80,90};
	Generic<Integer> objGeneric = new Generic<>();
	Integer[] arr1=objGeneric.swap(arr, 1, 3);
	for(int i : arr1) {
		System.out.println(i);
	 }
  }

}