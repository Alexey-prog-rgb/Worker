package org.example;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        OnTackDoneListener callack = System.out::println;

        Worker worker = new Worker(callack);
        worker.start();
    }
}