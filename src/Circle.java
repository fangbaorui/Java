public class Circle{
    public static void main(String[]args){
        int myArray[];  //数组声明
        myArray=new int[10];  //创建数组
        myArray[0]=0;
        myArray[1]=1;
        myArray[2]=2;
        myArray[9]=9;
        System.out.println("Index\t\tValue");
        for(int i=0;i<myArray.length;i++)
        {
            System.out.println(i+"\t\t"+myArray[i]);
        }
        System.out.print("Values:");
        for(int i:myArray) //使用增强for循环遍历数组，在JDK5及以上版本上运行
        {
            System.out.print(i+" ");
        }
        System.out.print("\n");
        //证明数组元素默认初始化为0
        //myArray[10]=100;
    }
}


