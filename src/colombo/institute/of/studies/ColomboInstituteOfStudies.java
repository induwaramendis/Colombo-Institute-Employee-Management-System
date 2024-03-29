 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colombo.institute.of.studies;

import javax.swing.JOptionPane;


public class ColomboInstituteOfStudies {

    
    public static void main(String[] args) {
        welcome wl=new welcome();
        wl.setVisible(true);
        try{
            for(int x =0;x<100;x++){
                Thread.sleep(50);
                
                wl.num1.setText(Integer.toString(x)+"%");
                wl.bar1.setValue(x);
            }
            Menu lgn=new Menu();
            lgn.setVisible(true);
            wl.hide();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
