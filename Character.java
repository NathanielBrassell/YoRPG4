public abstract class Character{

    protected String _name = "";
    protected int _hp = 0;
    protected int _def = 0;
    protected int _str = 0;
    protected double _atk = 0.0;
    protected double permatk = 0.0;
    protected double _dex = 0.0;
    protected double permdex = 0.0;

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
	int dmg = (int)((_str * _atk) - (NPC.getDefense() * _dex));

	if (dmg < 0){
	    dmg = 0;
	}

	NPC.lowerHP(dmg);

	return dmg;
    }  
    public void normalize(){
	_dex = permdex;
	_atk = permatk;
    }

    public void specialize(){
	_dex = _dex - .05;
	_atk = _atk + .05;
    }

    abstract String about();

}
