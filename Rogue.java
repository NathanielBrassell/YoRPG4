public class Rogue extends Character{

    private double _dex = 0.0;

    public Rogue(String name){



	      _name = name;

	      _hp = 100;

	      _str = 40;

      	      _def = 20;

	      _dex = 0.5;
	      
	      _atk = 0.3;


    }



    public String about(){

	return "A Rogue uses his speed to dodge enemy attacks while poking them with a small knife.";

    }


    public void HPot(){
   	if (_Hpot > 0){
        	_hp = _hp + 25;
        }
        else{
            	System.out.println("Thou hast no more Health Potions");
        }
    }


    public void lowerHP( int dmg ){

        _hp = (int)(dmg - (((int)Math.random() * 10) * _dex));

    }
    
    public void specialize(){
    	
    	_def = 15;
    	_atk = 0.5;
    	
    }
    
    public void normalize(){
    	
    	_def = 30;
    	_atk = 0.3;
    	
    }

    public String Stats(){
	String ret;
	ret += _name + " is a Rogue with a defense of "+ _def + ", a strength of "+ _str+ " and has " + _hp+ "Health Points left.";
	return ret;
}

}
