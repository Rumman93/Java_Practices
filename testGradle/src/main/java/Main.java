import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        Gson gson=new Gson();
        MyApp myApp=new MyApp();
        myApp.setName("Rumman");
        myApp.setAge(25);
        System.out.println(gson.toJson(myApp));


    }
}
