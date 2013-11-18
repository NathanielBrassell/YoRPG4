public class Sage extends Character {

    // Constructor
    public Sage() {
    	_health = 150;
	    _strength = (int)(Math.random() * 45) + 100;
	    _defense = 50;
	    _attack = 5.0;
    }

    public String about() {
	    return "The sage is an intelligent character devoted to helping the warriors fight monsters when they stumble across battles.";
    }
    
    public void specialize(){
            _def = 40;
            _atk = 0.8;
    }
    
    public void normalize(){
            _def = 60;
            _atk = 0.5;
    }
  
}
