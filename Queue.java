public class Queue {
    private int[] elements;
    private int size = 0;
    private final int default_capacity = 8;
    Queue(){
        elements = new int[default_capacity];
    }
    Queue(int capacity){
        elements = new int[capacity];
    }
    public void enqueue(int v){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }
    public int dequeue(){
        int result = elements[0];
        for(int i = 0;i<size;i++){
            elements[i] = elements[i+1];
        }
        size--;
        return result;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
}
