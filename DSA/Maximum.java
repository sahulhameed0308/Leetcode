
public class Maximum {
	public static void main(String[]args) {
		int[] a= {12 , 5 , 27 , 9 , 18};
		int min= a[0];
		for(int i=1;i>a.length;i--) {
			if(a[i]>min) min=a[i];
		}
		System.out.println(min);
	}

}
