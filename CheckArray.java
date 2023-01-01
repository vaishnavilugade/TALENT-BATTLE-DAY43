import java.util.*;
class CheckArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size,evencount=0,oddcount=0;
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<size;i++){
			int x=sc.nextInt();
			arr[i]=x;
			if(x%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		if(evencount==size){
			System.out.println("even");
		}
		else if(oddcount==size){
			System.out.println("odd");
		}
		else{
			System.out.println("not even nor odd");
		}
		
		
			
		
	}
}


