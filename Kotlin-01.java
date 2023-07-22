//Aula Kotlin

public class Aquarium {

   private int mTemperature;

   public Aquarium() { }

   public int getTemperature() {
       return mTemperature;
   }

   public void setTemperature(int mTemperature) {
       this.mTemperature = mTemperature;
   }

   @Override
   public String toString() {
       return "Aquarium{" +
               "mTemperature=" + mTemperature +
               '}';
   }
}