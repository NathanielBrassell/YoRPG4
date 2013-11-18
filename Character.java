public abstract class Character{

    protected String _name = "";
    protected int _hp = 0;
    protected int _def = 0;
    protected int _str = 0;
    protected double _atk = 0.0;
    protected int _Hpot = 3;

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
    
    public void HPot(){
    	if (_Hpot > 0){
    		_hp = _hp + 25;
    	}
    	else{
    		System.out.println("Thou hast no more Health Potions");
    	}
    }

    public void lowerHP( int dmg ){
	_hp = _hp - dmg;
    }

    public int attack(Character NPC){
	int dmg = (int)(_str * _atk);

	if (dmg < 0){
	    dmg = 0;
	}

	NPC.lowerHP(dmg);

	return dmg;
    }  
    abstract void normalize();

    abstract void specialize();

    abstract String about();
    
    abstract String Stats();

}
