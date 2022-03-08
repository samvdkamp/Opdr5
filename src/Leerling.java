public class Leerling {
    String naam = null;
    double cijfer;
   public Leerling(String nm) {
      naam = nm;
   }
   public String getNaam(){
      return naam;
   }

   public void setCijfer(double c){
       cijfer = c;
    }

   public double getCijfer(){
       return cijfer;
   }

   public String toString(){
       return naam + " heeft cijfer: " + cijfer;
   }
}
