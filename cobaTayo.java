
package tugaspl;



public class cobaTayo {
      public static void main(String[] args) {
          Tayo mobilTayo = new Tayo("Tayo", "Biru", 6, "BM 1234 TIF", 60.0, 2.0);
          mobilTayo.info();
          mobilTayo.berangkat();
          mobilTayo.sampai();
          double jarakTempuh = mobilTayo.hitungJarak();
          System.out.println("Jarak tempuh mobil Tayo adalah " + jarakTempuh + " KM");
          
    }
    
}

