package assignment03;


import javax.swing.SwingUtilities;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList.load();
             SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        Menu menu = new Menu();
                    }
                });
             
           
             
    }
    
}








//CYPROZ BROTHERS~UT0007109-A