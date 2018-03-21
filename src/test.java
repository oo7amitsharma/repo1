import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

public class test {

    public test(){


        ArrayList aa = new ArrayList();
        Hashtable h = new Hashtable();
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\akumar10\\Desktop\\text5.txt"));

            String buff;
            while((buff=in.readLine()) != null)
           {
                StringTokenizer t = new StringTokenizer(buff,",");
                      while(t.hasMoreTokens()){
                String s = t.nextToken().trim();
               if(!aa.contains(s))aa.add(s);
                          if(h.get(s) != null){
                              Integer n = (Integer)h.get(s);
                              h.put(s, new Integer(n.intValue() +1));


                          }  else {

                       //       System.out.println(" s" + s);
                              h.put(s, new Integer(1));
                          }





            }

        }
            in.close();
        }catch(Exception ex) {
            System.out.println("Errorr");


    }
        for(int j=0; j<aa.size(); j++){
            String s = (String) aa.get(j);
          //  System.out.println("ss  " + s);
            Integer n = (Integer) h.get(s);

            System.out.println(s + " " + n.intValue());

        }

    }
   public static void main(String [] args ){
       new test();
   }


}