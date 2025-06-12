package Ex_06_ternary_operator;

public class lab67_age {
    public static void main(String[] args) {
        int age =57;
        String result=age<18?"minor":(age<65)?"adult":"Senior";
        System.out.println(result);
    }
}
