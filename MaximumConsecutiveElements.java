

public class Main
{
	public static void main(String[] args) {
	int[] arr={1,1,0,0,1,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,};
	int count=0; int max=0; int ele=arr[0];
	for(int i=0; i<arr.length-1; i++){
	    if(arr[i]==arr[i+1]){
	        count++;
	        if(max <count){
	            max=count;
	            ele=arr[i];
	        }
	    }
	    else{
	        count=0;
	    }
	}
	System.out.println("Element: "+ele+" max: "+max);
	}
}
