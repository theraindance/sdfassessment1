package mailfold;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

    public class mailmerging {
        public static void main(String[] args)throws Exception {
        //File f = new File("C:\\Users\\snow_\\Documents\\sdfassessmentfolder\\mailsample\\thankyou.csv"); 
        File f = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(f)); 
        String readLine = ""; 
        String name = "Client";
    //System.out.println("Reading file using Buffered Reader");
int i = 0;
int iteration = 0;
{
    while ((readLine = br.readLine()) != null) 
        { 
            if(iteration == 0) {
            iteration ++;  
            continue;}
            {
                String str;

        while ((str = br.readLine())!= null) {
            String[] ar=str.split(",");
            String address = (ar[2]);
            address = address.replace("\n", " ");
            
            String dear = "dear";
            String firstName = (ar[0]);
            System.out.println("dear "+ firstName);
            String years = (ar[3]);
            String thankyoufor = address + "\n\nDear " + firstName + ",\n\nThank you for staying with us over these " + years + " years.";
            //String is = (ar[1]);


        //System.out.println(readLine);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\snow_\\Documents\\sdfassessmentfolder\\task01" + name + i++ + ".txt"); 
            //fo.write(readLine.getBytes());
            
            fout.write(thankyoufor.getBytes()); 
            
            //fo.write(is.getBytes()); 
            fout.close(); 
        }}
            } br.close();
        
    }
}}