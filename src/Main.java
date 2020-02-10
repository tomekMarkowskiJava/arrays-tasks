import findarray.MyFindArray;

public class Main {

    public static void main(String[] args) {

        MyFindArray myFindArray = new MyFindArray();

        //Finding the second value in an array
        int[] numbers = myFindArray.createArray();
        myFindArray.findSecond(numbers);

        //Finding a subarray in a main array and getting a starting index.
        int[] array = {0,0,3,7,0,3,7,0};
        int[] subarray = {3,7};

        int startingIndex = myFindArray.findArray(array, subarray);

        if (startingIndex>=0){
            System.out.println("Arrays index of the subarray last starting value is " + startingIndex );
        }





    }






}
