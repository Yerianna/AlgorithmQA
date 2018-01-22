package main;

public class Queue {
    // Queue follows FIFO rules
    // Use an fixed length of array to work as a queue
    int[] array;
    int length;
    int size;

    public Queue(int length) {
        this.array = new int[length];
        this.length = length;
        this.size = 0;
    }

    public int push(int o){
        if(size < length){
            array[size] = o;
            size++;
            return 1;
        }

        // Queue is full
        return -1;
    }

    public int pop(){
        if(size != 0){
            // shift in
            int temp = array[0];
            for(int i = 1; i < size; i++){
                array[i-1] = array[i];
            }
            size--;
            return temp;
        }
        // Queue is empty
        return -1;
    }
}
