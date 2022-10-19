public class GenericStack<E> {
 private E[] list=(E[])new Object[10];
 private int size=0;
 private int capacity=10;
  public int gitsize()
 {
     return this.size;
 }
 public E peek(){
     return list[size-1];
 }
 public void push(E o)
 {
     if (size==capacity)
     {
        capacity*=2;
         E[] list1=(E[])new Object[capacity];
            java.lang.System.arraycopy(list, 0, list1, 0, size);
        list=list1;  
     }
    list[size++]=o;
 }
 public E pop()
 {
    return list[size--];
 }
 public boolean isEmpty()
 {
     return size==0?true:false;
 }
 @Override
 public String toString()
 { 
    String s="stack: ";
    for (int i=0;i<size;i++) {
        s=s+" "+list[i];
    }
    return s;

 }
 public static void main(String[] args)
 {
        GenericStack<Integer> stack=new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
 }
}

