package work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    @Autowired
//    @Qualifier("laborer")
//    @Qualifier("mason")
    WorkerAble worker;

    public void doWork(String action){
        worker.work(action);
    }
}
