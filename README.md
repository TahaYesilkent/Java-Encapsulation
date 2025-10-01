# Java Temelleri ve OOP Alıştırmaları

Bu proje, Java dilinde **OOP (Nesne Yönelimli Programlama)** ve **metot aşırı yükleme (overloading)** konseptlerini uygulamalı olarak göstermektedir. Proje iki ana bölümden oluşur: bir **Oyun Karakteri Yönetim Sistemi** (`Player` ve `Weapon`) ve bir **Geometrik Nokta Hesaplama Sistemi** (`Point`).





        

##  Bölüm 1: Oyun Karakteri Sistemi (`Player` & `Weapon`)

Bu bölümde, bir oyun karakterinin temel özelliklerini ve davranışlarını yöneten sınıflar bulunmaktadır. **Kapsülleme (Encapsulation)** ve **veri doğrulama** prensipleri uygulanmıştır.

### Player Sınıfı

`Player` sınıfı, karakterin adını, can yüzdesini ve silahını yönetir.

| Özellik / Metot | Açıklama | Uygulanan Kavram |
| :--- | :--- | :--- |
| `name`, `healthPercentage`, `weapon` | Sınıfın özel (private) üyeleri. | Kapsülleme |
| `Player(...)` **Constructor** | Karakter oluşturulurken can yüzdesini **0-100 aralığında** sınırlar. | Veri Doğrulama |
| `loseHealth(int damage)` | Karakterin canını azaltır. Can sıfıra düşerse karakterin oyundan çıktığını bildirir. | Metot Kullanımı |
| `restoreHealth(int potion)` | Canı artırır ve canın **maksimum 100** olmasını sağlar. | Veri Doğrulama |
| `healthRemaining()` | Güncel can yüzdesini döndürür. | Getter |

### Weapon Enum

`Weapon` (Enum) sınıfı, oyundaki farklı silah türlerini, bunların sabit hasar (`damage`) ve saldırı hızı (`attackSpeed`) değerleriyle birlikte tanımlar.

| Silah | Hasar (`damage`) | Saldırı Hızı (`attackSpeed`) |
| :--- | :--- | :--- |
| `SWORD` | 50 | 1.2 |
| `AXE` | 70 | 0.9 |
| `BOW` | 40 | 1.5 |
| `DAGGER` | 30 | 2.0 |

---

##  Bölüm 2: Geometrik Nokta Hesaplama Sistemi (`Point`)

Bu bölüm, 2D bir noktayı temsil eden ve diğer noktalara veya orijine olan mesafeyi hesaplayabilen bir sınıfı içerir. (**Not:** `Point.java` sınıfının kodu verilmemiştir, ancak `Main.java`'daki kullanıma göre özellikleri çıkarılmıştır.)

### Point Sınıfı (Beklenen Fonksiyonalite)

| Metot Tanımı | Açıklama | Uygulanan Kavram |
| :--- | :--- | :--- |
| `distance()` | Noktanın **orijine** `(0, 0)` olan uzaklığını hesaplar. | Metot Kullanımı |
| `distance(Point another)` | Noktanın parametre olarak verilen başka bir `Point` nesnesine olan uzaklığını hesaplar. | Metot Overloading |
| `distance(int x, int y)` | Noktanın parametre olarak verilen koordinatlara olan uzaklığını hesaplar. | Metot Overloading |

---

##  Çalıştırma ve Test Senaryoları

`Main.java` sınıfı, yukarıdaki sınıfların temel işlevlerini ve kurallarını test etmek için tasarlanmıştır.

### Player Sınıfı Test Çıktısı (Özet)

Bu testler, constructor'daki can doğrulamasını (`>100` kontrolü), can kaybını, karakterin oyundan düşmesini (`knocked out`) ve can yenileme sırasında maksimum can kontrolünü göstermektedir.
