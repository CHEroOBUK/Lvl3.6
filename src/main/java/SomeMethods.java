public class SomeMethods {

    int[] getArrayPastLast4(int[] array) throws RuntimeException{
        int posLast4 = -1;
        int[] newArray;
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] == 4) {
                posLast4 = i;
                break;
            }
        }
        if (posLast4 == -1){
            throw new RuntimeException("В массиве нет значения \"4\"");
        }
        newArray = new int[array.length-posLast4-1];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = array[posLast4+i+1];
        }
        return newArray;
    }

    boolean is1and4exist(int[] array){
        boolean is1Exist = false;
        boolean is4Exist = false;
        for (int a : array) {
            if (a == 1 && !is1Exist) is1Exist = true;
            if (a == 4 && !is4Exist) is4Exist = true;
        }
        return is1Exist && is4Exist;
    }

}
