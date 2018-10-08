package src;

public class Problem2Sort {
public int[] MergeSort(int[] a) {
	int length=a.length;
	int b=length/2;
	int[] c=Partition(a,0,b);
	int[] d=Partition(a,b,length);
	c=Sort(c);
	d=Sort(d);
	int j=0;
	int k=0;
	int i;
	int[] v=new int[a.length];
	for(i=0;i<a.length;i++) {
	if(c[j]>d[k]) {
		v[i]=c[j];
		j++;}
	else {
		v[i]=d[k];
		k++;
	}
	}
	return v;
	
}
public int[] Partition(int[] a, int b, int c) {
	int i;
	int j=0;
	int[] a2=new int[c-b];
	for(i=b;i<c;i++) {
	a2[j]=a[i];
	j++;
	}
	return a2;
}
public int[] Sort(int[] a) {
	int first=a[0];
	int i;
	for(i=1;i<a.length;i++) {
		if (first>a[i]) {
			Swap(first,a[i]);
		}
	}
	return a;
}
public void Swap(int a,int b) {
	int temp=0;
	a=temp;
	a=b;
	b=temp;
}

}
