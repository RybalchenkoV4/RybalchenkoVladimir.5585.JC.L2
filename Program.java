public class Program {

    public static void main(String[] args) {
        int[] array = {1,4,0,3,5,0,0,5,4,6};
        System.out.println(countEvens(array));
        System.out.println(diffMinMax(array));
        System.out.println(doubleZero(array));
    }


    public static int countEvens(int[] array){
        int count = 0;
        for(int elem : array){
            if(elem%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int diffMinMax(int[] array){
        int min = getMin(array);
        int max = getMax(array);
        return max - min;
    }

    public static boolean doubleZero(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i] == 0 && array[i-1] == 0){
                return true;
            }
        }
        return false;
    }
}
