public class Rogue extends Character{



    private String _name = "";

    private double _dex = 0.0;



    public Rogue(String name){



	_name = name;

	_hp = 100;

	_str = 40;

	_def = 20;

	_dex = 0.5;

	permdex = 0.5;

	_atk = 0.3;

	permatk = 0.3;



    }



    public String about(){

	return "A Rogue uses his speed to dodge enemy attacks while poking them with a small knife.";

    }



    public void lowerHP( int dmg ){

        _hp = (int)(dmg - (((int)Math.random() * 10) * _dex));

    }



}
