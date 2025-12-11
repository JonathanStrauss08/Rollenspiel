//import java.util.Random;
public class Drache{
    private String name;
    private int lebenspunkte;
    private int angriffschaden;

    public Drache(String pName){
        name = pName;
        lebenspunkte = (int) ((Math.random()*200)+200);
        angriffschaden = 50;
    }

    public void blocken(int pAngriff){
        if(zufallszahl(0,100)>80){
            System.out.println("Der Drach weicht dem Angriff aus!");        
            return ;
        }else{

            if(lebenspunkte - pAngriff <= 0){
                lebenspunkte = 0;
                System.out.println("Drache ist besiegt!");
            }
            else{
                lebenspunkte = lebenspunkte - pAngriff; 
            }
        }
    }

    public int  angriff(){
        if(zufallszahl(0,100)>90){
            System.out.println("Der Drache speit Feuer und greift dich mit "+angriffschaden*10+" an");        
            return angriffschaden*10;
        }
        System.out.println("Der Drache greift mit"+angriffschaden+" an");        
        return angriffschaden;
    }

    private int zufallszahl(int min, int max){
        return (int) (Math.random()*(max-min)+min);
    }
}