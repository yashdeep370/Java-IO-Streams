import java.io.ByteArrayInputStream;

public class byted {
    public static void main(String[] args) throws Exception {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        
        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        bis.close();

        // int x;
        // while((x=bis.read())!=-1) {
        //     System.out.println((char)x);
        // }
        // bis.close();
    }
}
