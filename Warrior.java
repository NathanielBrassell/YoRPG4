public class Warrior extends Character{

    String _name = "";

    public Warrior(String name){

	_name = name;
	_hp = 125;
	_str = 100;
	_def = 40;
	_atk = 0.4;

    }

    public String about(){
	return "A Warrior uses his sword to cleave thru his enemy's flesh and bone";
    }
    
    public void specialize(){
    	_def = 30;
    	_atk = 0.7;
    }
    
    public void normalize(){
    	_def = 40;
    	_atk = 0.4;
    }

}
