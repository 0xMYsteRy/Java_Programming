package OOP_Class.Week3;

import java.lang.reflect.Method;

class AddNumber {
    public int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}

class MethodAdd {
    public static void main(String[] args) {

        AddNumber methodadd = new AddNumber();
        int sum1 = methodadd.add(1,2);

        //System.out.println("OK");
        System.out.println(sum1);
    }
}