package clientrun;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class clienty {
    public static void main(String[] args) {
        
    
    try {
        Socket sock = new Socket("68.183.239.26", 80);
        InputStream is = sock.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        OutputStream os = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Console cons = System.console();
        //String input = cons.readLine("Send command to server > ");
        //dos.writeUTF(input);
        dos.flush();
        
        String response = dis.readUTF();
            if(response.contains("text")){
                System.out.println(response);
                String[] Value = response.split(" ");
                System.out.printf("from server >> %s\n", Value[1]);
            }
                

            is.close();
            os.close();

            sock.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}