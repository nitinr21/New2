package src;
import java.util.Arrays;
public class Problem4Sort {
	public int[] Problem4A(int[] a){
		int halfpoint=a.length/2;
		Arrays.sort(a);
		int[] newarray = null;
		int i,j,k;
		for(i=0;i<halfpoint;i++)
			for(j=0;j<a.length;j+=2) {
				newarray[j]=a[i];
			}
		for(i=halfpoint;i<a.length;i++) {
			for(j=1;j<a.length;j+=2) {
				newarray[j]=a[i];
			}
		}
		return a;
		
	}
}
