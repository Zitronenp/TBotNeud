package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        Get input = new Get();
        input.getConsoleIn();

        Data processing = new Data(input.inputData);

        Out out = new Out(processing.data);
        out.consPrint();

    }
}