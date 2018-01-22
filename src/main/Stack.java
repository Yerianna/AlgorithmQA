package main;

public class Stack {
    // Stack follows FILO rules
    // Use an fixed length of array to work as a queue

    int[] array;
    int length;
    int size;
    int min;

    public Stack(int length) {
        this.array = new int[length];
        this.length = length;
        size = 0;
    }

    public int push(int o){
        if(size < length){
            if(size == 0){
                min = o;
            }
            array[size] = o;
            size++;
            min = o < min ? o : min;
            return 1;
        }
        return -1;
    }

    public int pop(){
        if(size != 0){
            return array[--size];
        }
        return -1;
    }

    public int getMin() {
        return min;
    }
}
