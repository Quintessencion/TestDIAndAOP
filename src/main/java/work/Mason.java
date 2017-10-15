package work;

import org.springframework.stereotype.Component;

@Component
public class Mason implements WorkerAble {

    @Override
    public String work(String action) {
        System.out.println("Кладу кирпич!");
        return action;
    }
}
