import Custom.CustomArray;

public class Array2{
    
    public static void main(String[] args) {
        
        CustomArray myArr = new CustomArray(10);
        
        myArr.insert(2);
        myArr.insert(3);
        myArr.insert(4);
        myArr.insert(5);
        myArr.insert(6);
        myArr.insert(7);

        // myArr.removeAt(1);
        // myArr.removeAt(4);
        myArr.optimizeReverse();
        
        System.out.println(myArr);
    }
}