package Exercicio4;

public class C_MultiplicaThread {

    public static void main(String[] args) {
        C_Matriz m1 = new C_Matriz();
        C_Matriz m2 = new C_Matriz();
        C_Matriz m3 = new C_Matriz();
        m1.start();
        m2.start();
        m3.start();
    }
}
