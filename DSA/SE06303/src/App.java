import DataStructure.MyStack;

public class App {
    public static void main(String[] args) throws Exception {
       MyStack stack = new MyStack(10);
       stack.push(10);
       stack.push(20);
       stack.push(100);
       stack.push(1);
       stack.push(17);
       stack.push(8);
       stack.push(10);
       stack.push(106);
       stack.push(107);
       stack.push(108);
       stack.push(109);
       stack.print();
    }
}
