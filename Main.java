public class Main{
    public static void main(String[] args){
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.gameOver();
        womenGameCalculator.hesapla();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();

        // GameCalculator gameCalculator = new GameCalculator(); // Bu kullanım yanlıştır.

        GameCalculator gameCalculator2 = new GameCalculator() { // Bu kullanım doğrudur.
            public void hesapla(){ // Burada abstract methodu ezmemiz gerekir. Bu yüzden abstract sınıfı direkt newlemek bizi yorar.
                System.out.println("Merhaba"); // Bu kullanım yerine abstract sınıftan extends ettiğimiz alt sınıfları referans almak daha mantıklı olur.
            }
        };

        GameCalculator gameCalculator3 = new ManGameCalculator();
        gameCalculator3.hesapla();
        
    }
}