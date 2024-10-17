package oop;

public class MyStack {

    private static int MAX_SIZE = 10;
    public String[] arr = new String[MAX_SIZE];
    private int pointer = 0;
    // null, null, null, null,null,null, null, null, null,null

    public void push(String item) {
        arr[pointer++] = item;
    }

    public String pop(){
        String result = arr[pointer - 1];
        arr[--pointer] = null;
        return result;
    }

    public void showElements() {
        for (int i = 0; i < pointer; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
