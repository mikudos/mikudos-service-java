package grpc;

import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import com.mikudos.grpcclient.Client;

public class Server {
    public static void echo() throws FileNotFoundException {
        //初始化Yaml解析器
        Yaml yaml = new Yaml();
        File f=new File("config/default.yaml");
        //读入文件
        Map result= yaml.load(new FileInputStream(f));
        System.out.println(result);
        System.out.println((int)result.get("port"));
        System.out.println(result.get("children"));
        System.out.println("test Main Class");
        System.out.println("this is Server echo!");
        new Client().clientEcho();
    }
}
