package oj;

public class Paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paixu px=new Paixu();
		int []a= {5,6,8,2,4,1};
		System.out.println("排序前");
		px.print(a);
		px.Zjcr(a);
		System.out.println("排序后");
		px.print(a);
		
	}
	//打印输出
	public void print(int []array){
		for(int i=0;i<array.length-1;i++){
			System.out.print(array[i]);
		}
		System.out.println(array[array.length-1]);
	}
	//直接插入排序
	public void Zjcr(int []a){
		
		
		 for(int i=1;i<a.length;i++){//从头部第一个当做已经排好序的，把后面的一个一个的插到已经排好的列表中去。    
             int j=0;    
             int x=a[i];//x为待插入元素    
             for( j=i;  j>0 && x<a[j-1];j--){//通过循环，逐个后移一位找到要插入的位置。    
                 a[j]=a[j-1];    
             }    
             a[j]=x;//插入    
		 }
		
	}
}
 