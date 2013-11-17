public abstract class Character{

    protected String _name = "";
    protected int _hp = 0;
    protected int _def = 0;
    protected int permdef = 0;
    protected int _str = 0;
    protected double _atk = 0.0;
    protected double permatk = 0.0;

    public boolean isAlive(){
	return _hp > 0;
    }

    public String getName(){
	return _name;
    }

    public int getStrength(){
	return _str;
    }

    public double getAttack(){
	return _atk;
    }

    public int getDefense(){
	return _def;
    }

    public int getHP(){
	return _hp;
    }

    public void lowerHP( int dmg ){
	_hp = _hp - dmg;
    }

    public int attack(Character NPC){
	int dmg = _str * _atk;

	if (dmg < 0){
	    dmg = 0;
	}

	NPC.lowerHP(dmg);

	return dmg;
    }  
    abstract void normalize(){
	_def = permdef;
	_atk = permatk;
    }

    abstract void specialize(){
	_def = _def - 5;
	_atk = _atk + .05;
    }

    abstract String about();

}
