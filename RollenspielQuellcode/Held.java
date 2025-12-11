public class Held {
    private int lebenspunkte;   
    private String faehigkeit = "heilen";
    private Ruestung meineRuestung;
    private String name;
    private int erfahrung = 50; // Erfahrung zwischen 0 und 100
    private Waffe meineWaffe;
    private Drache meinDrache;

    public Held(int pLebenspunkte, int pAngriffschaden, String pFaehigkeit, String pName) {

    }

    public Held() {
        lebenspunkte = 100;    
        //faehigkeit;
        meineRuestung = new Ruestung();
        name = "Gandalf";        
        meineWaffe = new Waffe();
        meinDrache = new Drache("Samaug");
    }  

    public void blocken() {
        int angriff = meinDrache.angriff();
        int schaden = angriff - meineRuestung.getVerteidigungspunkte();
        if(schaden < 0) {
            schaden = 0;
        }
        lebenspunkte = lebenspunkte - schaden;
        System.out.println("Der Drache hat dich mit "+schaden+" HP Angegriffen, du hast "+ schaden+" Lebenspunkte verloren. Es bleiben dir "+ lebenspunkte+" Lebenspunkte");
    }

    public void angriff() {
        int schlagen = meineWaffe.schlagen();//Wir lassen uns die Angriffskraft der Waffe geben     
        int angriff = (int) schlagen+erfahrung;            
        int neueErfahrung = zufallszahl(0,8);  
        System.out.println("Der Drache wurde mit "+angriff+" HP Angegriffen, du hast "+neueErfahrung+" Erfahrungspunkte dazugewonnen");
        erfahrung += neueErfahrung;
        meinDrache.blocken(angriff); 
    }

    public void heilen () {
        if (lebenspunkte < 100) {
            if(zufallszahl(0,100)>40){
                int heilung = zufallszahl(30,50);  
                lebenspunkte += heilung;
                System.out.println(" Der Held hat sich um "+ heilung +" Lebenspunkte geheilt");
            }else{
                System.out.println(" Das Heilen war leider nicht erfolgreich, es muss der falsche Trank gewesen sein.");
            }  
        } else {
            System.out.println(" Der Held ist nicht verletzt!");
        }
    }

    private int zufallszahl(int min, int max){
        return (int) (Math.random()*(max-min)+min);
    }

    public void spiele(int runden){
        for(int i = 0; i< runden;i++){
            angriff();
            blocken();
        }

    }
}
