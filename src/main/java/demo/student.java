package demo;


import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class student {

    private  int id;
    private  String name;
    private String age;

    public  void  sout(){

        System.out.println("这是 student  类");
    }

}
