public class Monster extends Character{



    public Monster(){

	_str = 20+((int)(Math.random() * 45));

	_hp = 150;

	_def = 20;

	_dex = 0.7;

	_atk = 1.0;



    }



    public String about(){

	return "A Monster uses his claws to rend his enemy.";

    }



}
