package Custom;

public class CustomArray 
{
    private int[] arr;
    private int currentIndex;

    public CustomArray(int size) 
    {
        this.arr = new int[size];
        this.currentIndex = 0;
    }

    public void insert(int value) 
    {
        if( currentIndex == arr.length ){
            
            int[] tempArr = new int[arr.length * 2];

            for(int i = 0; i < currentIndex; i++){
                tempArr[i] = arr[i];
            }

            arr = tempArr;
        }

        this.arr[currentIndex] = value;
        this.currentIndex++;
    }

    public int indexOf( int value )
    {
        for( int i = 0; i < this.currentIndex; i++ )
        {
            if( this.arr[i] == value )
            {
                return i;
            }
        }

        return -1;
    }

    public void removeAt ( int index )
    {
        if (index > this.currentIndex - 1) throw new IllegalArgumentException();

        for( int i = index; i < this.currentIndex - 1; i++ )
        {
            this.arr[i] = this.arr[i + 1];
        }

        this.arr[this.currentIndex - 1] = 0;
        this.currentIndex--;
    }

    public int max()
    {
        int restult = this.arr[0];

        for ( int i = 1; i < this.currentIndex; i++ )
        {
            if( this.arr[i] > restult )
            {
                restult = this.arr[i];
            }
        }

        return restult;
    }

    public int min()
    {
        int restult = this.arr[0];

        for( int i = 0; i < this.currentIndex; i++)
        {
            if( this.arr[i] < restult )
            {
                restult = this.arr[i];
            }
        }

        return restult;
    }

    public CustomArray reverse()
    {
        CustomArray tempArr = new CustomArray(this.currentIndex);
        int tempIndex = this.currentIndex - 1;

        for ( int index = 0; index < this.currentIndex; index++ )
        {
            if( tempIndex <= 0 ) break;

            tempArr.insert( this.arr[tempIndex] );
            tempIndex--;

        }

        return tempArr;
    }

    public void optimizeReverse()
    {
        int i = 0;
        int j = this.currentIndex - 1;

        while( i < j )
        {
            int temp = this.arr[i];
            this.arr[i] = this.arr[j];
            this.arr[j] = temp;
            i++;
            j--;
        }
    }

    public String toString() 
    {
        StringBuilder str = new StringBuilder();

        str.append('[');

        for (int i = 0; i < this.currentIndex; i++)
        {
            str.append(this.arr[i]).append(", ");
        }

        str.append('\b').append('\b').append(']');
        
        return str.toString();
    }

}
