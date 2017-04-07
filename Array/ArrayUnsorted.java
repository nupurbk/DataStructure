//Search,Insert and Delete Operation on unsorted array

import java.io.*;

class ArrayOperations {
	public static void main (String[] args) {
		
		int[] arr={2,3,5,4,6};
	    int[] arr1=new int[arr.length+1];
		int sizeArray=arr.length;
		int key=5;
		
	    //insert	
		/*
		int position=6;
		int[] newArray=new int[8];
		newArray=insertElement(key,arr,sizeArray,position,arr1);
		for(int i=0;i<newArray.length;i++){
		System.out.println("New Array: "+newArray[i]);
		*/
		
		//delete
		int[] newArray=new int[6];
		newArray=delete(key,arr,sizeArray,arr1);
		for(int i=0;i<newArray.length;i++){
		System.out.println("New Array: "+newArray[i]);
		}
		
		//search
		/*
		position=findElement(key,arr,sizeArray);
		if(position==-1){
		    System.out.println("Element doesnt exist in array");
		   
		}
		else{
		     System.out.println("Element exists in array at positiob"+position);
		}
		*/
		
	}
	
	public static int findElement(int key,int[] arr, int sizeArray){
	    int pos=-1;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==key){
	            pos=i;
	        }
	        
	    }
	    return pos;
	}
	
	public static int[] insertElement(int key,int[] arr,int sizeArray,int pos,int[] arr1){
	    
	    int i=0;
	    while(i!=pos-1){
	        arr1[i]=arr[i];
	        i++;
	       
	    }
	    arr1[i]=key;
	    for(int j=i+1;j<arr1.length;j++)
	    {
	        arr1[j]=arr[j-1];
	    }
	    
	    //System.out.println("New Array: "+arr);
	    return arr1;
	    
	}
	
	public static int[] delete(int key,int[] arr,int sizeArray,int[] arr1){
	    
	   int i=0;
	   int pos;
	   pos=findElement(key,arr,sizeArray);
	   //System.out.println(pos);
	   while(i!=pos){
	        arr1[i]=arr[i];
	        i++;
	       
	    }
	    //System.out.println(i);
	    for(int j=i;j<arr.length-1;j++)
	    {
	        arr1[j]=arr[j+1];
	    }
	    
	    //System.out.println("New Array: "+arr);
	    return arr1;
	    
	    
	    
	}
}

