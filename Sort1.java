package Arrays;

public class Sort1 {
     
	public static void main(String[] args) {
		int a[]=new int[3];
		int temp=0;
		a[0]=1;
		a[1]=5;
		a[2]=6;

		for(int i=0;i<=2;i++) {
			for(int j=i+1;j<=2;j++) {
				if(a[i]<a[j])
				{
			     temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				  
				}	
				
			}
			System.out.println(a[i]);
		}
	}

}
