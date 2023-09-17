public class Lab6_3_64010792 {
    public static void main(String[] args) {
        Queue q = new Queue(8);
        for(int i = 1;i <= 20;i++){
            q.enqueue(i);
        }
        System.out.println("Size : "+q.getSize());
        System.out.println("-----------------------");
        int size = q.getSize();
        for(int i = 1;i<=size;i++){
            System.out.println(q.dequeue());
        }
        System.out.println("-----------------------");
        System.out.println("empty? : "+q.empty());
        System.out.println("Size : "+q.getSize());
    }
}
