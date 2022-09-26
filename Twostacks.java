
public class TwoStacks {
    int top1;
    int top2;
    int size;
    int[] arr;
    TwoStacks(int size){
        this.top1=-1;
        this.top2=size;
        this.size=size;
        this.arr=new int[size];
    }

    public void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop1(){
        if(top1<0){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        else{
            int x=arr[top1];
            top1--;
            return x;
        }
    }
    public int pop2(){
        if(top2==size){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        else{
            int x=arr[top2];
            top2++;
            return x;
        }
    }

    public static void main(String[] args) {
        TwoStacks s=new TwoStacks(10);
        s.push2(12);
        s.push2(14);
        s.push2(16);
        s.push2(18);
        s.push2(20);
        s.push1(10);
        s.push1(8);
        s.push1(6);
        s.push1(4);
        s.push1(2);
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
    }
}
