package demo;


import lombok.Data;

@Data
public class person {

    private int id;
    private  String  name;
    private  int sex;
    private  String age;

    public  void  hello(){
        System.out.println("hello world");
    }

}
