package src;

public class Problem1Sort {
	public void Problem1Sorting(int[] a) {
			
		}
		
	public int[] Output(int[] array, int token, int a, int b, int f) {
		int maximum=Max(array);
		String max=Integer.toString(maximum);
		for(a=0;a<array.length;a++) {
			for(b=a+1;a<array.length;a++) {
				for(f=max.length();f>0;f--) {
				token=Compare(Radix(array[a],f),Radix(array[b],f));
				if (token==1){
					Swap(array[a],array[b]);
				}}
			}
		}
		return array;
		}
	public int SpaceException(int a){
		return 0;}
	public int Max(int[] a) {
		int max=a[0];
		int i;
		for(i=1;i<a.length;i++) {
			if (a[i]>max) {
				Swap(a[i],max);
			}
		}
		return max;
	}
	
	public int Radix(int a, int rad) {
	int r=(a/rad)%10;
	if (r==a) {
		return SpaceException(r);
	}
	else {
		return r;
	}}
	
	public int Compare(int a,int b) {
		if(a>b) {
			return 1;	
		}
		else return 0;
	}
	public void Swap(int a,int b) {
		int temp=0;
		a=temp;
		a=b;
		b=temp;
	}
	
	
   

}
