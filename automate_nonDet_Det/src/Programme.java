import java.io.*;

public class Programme {
    public static void main(String Args[]) throws IOException
    {/*
        Automate automate=new Automate();
        automate.afficher_instru();
        automate.ToDeterminist();
        automate.afficher_automate();
*/


        PrintWriter f=null;
        FileWriter fichier=new FileWriter("fichier.txt");
        f=new PrintWriter(fichier);

        f.println("kjlkjlkjlkjlkj");

        f.close();


/*
        try{
            fos=new FileOutputStream(new File("test2.txt"));


        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try {
                if (fos != null) {
                    fos.close();
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }*/
    }

}