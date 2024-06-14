import java.util.ArrayList;
class StackCustom < T > {
    ArrayList < T > arryList;
    int size;
    int top = -1;
    StackCustom(int size) {
        arryList = new ArrayList < > (size);
        this.size = size;
    }

    public void push(T item) {
        if (top + 1 == size) {
            System.out.println("Stack is Full");
        } else {
            top++;
            if (arryList.size() > top + 1) {
                arryList.set(top, item);
            } else {
                arryList.add(item);
            }
        }
    }
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            return arryList.get(top--);
        }
    }

    public T peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            return arryList.get(top);
        }
    }
    public static void main(String[] str) {
        StackCustom < Integer > stc = new StackCustom < Integer > (2);
        stc.push(10);
        stc.push(20);
        stc.push(30);
        stc.push(40);
        stc.push(50);
        stc.pop();
        stc.push(70);
        stc.push(80);
        System.out.println(stc.toString());
    }

}
