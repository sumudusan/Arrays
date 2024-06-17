import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Example for ArrayList
        /*
        //create ArrayList
        ArrayList<Integer> arr=new ArrayList<>(10);
        arr.add(0,1); //Add values for indexes for my opinion
        arr.add(2); //Add values without my opinion
        arr.add(3);
        arr.remove(1); //Remove value from index 1
        arr.set(0, 50); //change value of index 0

        System.out.println(arr);
        System.out.println(arr.size()); //get the size of array
        //print all values in array within single statement
        for(Integer x:arr)
        {
            System.out.println(x);
        }
         */
//-----------------------------------------------------------------------------------------

        //Get User inputs from array
        /*
        int [] arr=new int[5];
        int size=5;

        Scanner sun=new Scanner(System.in);

        System.out.println("Enter numbers");
        for(int j=0;j<size;j++)
        {
            arr[j]=sun.nextInt();
        }

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        */

     //   --------------------------------------------------------------------------------------
        //Insert a value to Array
        /*int [] arr=new int[10];
        int size=5;

        Scanner sun=new Scanner(System.in);

        System.out.println("Enter numbers");
        for(int j=0;j<size;j++)
        {
            arr[j]=sun.nextInt();
        }

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the index");
        int ind=sun.nextInt();

        System.out.println("Enter the element");
        int ele=sun.nextInt();

        size++;

        for(int k=size;k>=ind;k--)
        {
            arr[k]=arr[k-1];
        }
        arr[ind]=ele;

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
*/
//-------------------------------------------------------------------------------------------------
  //Delete a value from Array

       /* int [] arr=new int[10];
        int size=5;

        Scanner sun=new Scanner(System.in);

        System.out.println("Enter numbers");
        for(int j=0;j<size;j++)
        {
            arr[j]=sun.nextInt();
        }

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the index");
        int ind=sun.nextInt();

        for(int k=ind;k<size;k++)
        {
            arr[k]=arr[k+1];
        }

        size--;

        System.out.println("Output=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
   */
//---------------------------------------------------------------------------------------------
        //Search a element
     /*
        int [] arr=new int[10];
        int size=5;

        Scanner sun=new Scanner(System.in);

        System.out.println("Enter numbers");
        for(int j=0;j<size;j++)
        {
            arr[j]=sun.nextInt();
        }

        System.out.println("Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


        System.out.println("Enter the number");
        int num=sun.nextInt();


        int k;
        for(k=0;k<size;k++)
        {
            if(arr[k]==num)
            {
                break;
            }
        }
        System.out.println("Index of the number="+k);
*/

        //-*----------------------------------------------------------------------------------
        //Update Data
        int [] arr=new int[10];
        int size=5;

        Scanner sun=new Scanner(System.in);

        System.out.println("Enter numbers");
        for(int j=0;j<size;j++)
        {
            arr[j]=sun.nextInt();
        }

        System.out.println("Numbers=");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the index what you want to update:");
        int ind=sun.nextInt();

        System.out.println("Enter the element");
        int num=sun.nextInt();

        arr[ind]=num;;

        System.out.println("output=");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}