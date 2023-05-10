
package tugaspl;

class Tayo{

    String merek;
    String warna;
    int jumlahRoda;
    String noPlat;
    double kecepatan;
    double waktuTempuh;
    
    Tayo(String merek, String warna, int jumlahRoda, String noPlat, double kecepatan, double waktuTempuh){
        this.merek = merek;
        this.warna = warna;
        this.jumlahRoda = jumlahRoda;
        this.noPlat = noPlat;
        this.kecepatan = kecepatan;
        this.waktuTempuh = waktuTempuh;
    }  
        
    void info(){
        System.out.println("Merek : " + this.merek);
        System.out.println("Warna : " + this.warna);
        System.out.println("jumlahRoda : " + this.jumlahRoda);
        System.out.println("noPlat : " + this.noPlat);
    }
    
    void berangkat(){
        System.out.println("Mobil Tayo berangkat dari kampus UIN Suska Riau dengan kecepatan " + this.kecepatan + " km/jam");
    
    }    
    void sampai(){
        System.out.println("Setelah " + this.waktuTempuh + "jam, Mobil Tayo sampai ke pusat kota");
    
    }    
    
    double hitungJarak(){
        double jarakTempuh = kecepatan * waktuTempuh;
        return jarakTempuh;
    }
       
       

}

