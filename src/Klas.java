import java.util.ArrayList;
public class Klas {
    String klascode = null;

    ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();

    public Klas(String kC){
       klascode = kC;
    }
    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){

       for(int i = 0; i < leerlingen.size(); i++){
           if(nm.equals(leerlingen.get(i).getNaam())){
               leerlingen.get(i).setCijfer(nweCijfer);
           }
       }
    }

    public ArrayList getLeerlingen(){
       return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    public String toString(){

        return "in klas " + klascode + " zitten de volgende leerlingen: \n" + leerlingen.get(0).toString() + "\n" + leerlingen.get(1).toString() + "\n" + leerlingen.get(2).toString();

    }

}
