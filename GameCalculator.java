public abstract class GameCalculator { // Normal koşullarda burada bir sürü algoritma olur.
    // methodumuz abstract olması için classımızda abstract olması lazım !!!
    // class abstract iken methodların hiçbiri abstract olmak zorunda değildir.
    // abstract bir sınıfı direkt newleyemeyiz ama onu extends eden sınıfı referans alıp alt sınıfı newleyebiliriz.
    // hesapla() methodu GameCalculator classını extends eden herkes kullanmak zorundadır. Çünkü abstract edilmiştir.
    // Dikkat ettiyseniz final ile abstract tersine çalışır. final komutu override etmesini istemez iken abstract sınıfı override etmek zorundadır.
    // Override ettiğimiz methodun üstüne @Override yazmamız daha sağlıklı olur.
    public abstract void hesapla();// Bu operasyonun hiçbir şekilde defaultu olmasın istiyorum o yüzden abstract kullandım.
    


    public final void gameOver(){ // override edilmesini istemiyorsak public final void kullanılır.
        System.out.println("Oyun bitti.");
    }
}
