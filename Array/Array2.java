import Custom.CustomArray;

public class Array2{
    
    public static void main(String[] args) {
        
        CustomArray myArr = new CustomArray(10);
        
        myArr.insert(2);
        myArr.insert(20);
        myArr.insert(300);
        myArr.insert(5);
        myArr.insert(50);
        myArr.insert(4);

        myArr.removeAt(1);
        myArr.removeAt(4);
        
        System.out.println(myArr.min());
    }
}