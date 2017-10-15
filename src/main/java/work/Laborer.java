package work;

public class Laborer implements WorkerAble {

    @Override
    public String work(String action) {
        System.out.println("Я копаю!");
        return action;
    }
}
