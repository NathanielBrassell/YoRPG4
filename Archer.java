  /*=============================================
    class Archer -- the second protagonist of Ye Olde RPG
    =============================================*/
  
  public class Archer extends Character {
  
      // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
      private String _name = "Robbin Hood";
      private int _hp, _str, _def;
      private double _atk;
      protected int _Hpot = 3;
      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  
      /*=============================================
        default constructor
        pre:  instance vars are declared
        post: initializes instance vars.
        =============================================*/
      public Archer() {
  	    _hp = 125;
  	    _str = 100;
  	    _def = 40;
  	    _atk = .4; 
      }
  
  
      /*=============================================
        overloaded constructor
        pre:  instance vars are declared
        post: initializes instance vars. _name is set to input String.
        =============================================*/
      public Archer( String name ) {
  	    this();
  	    _name = name;
      }
  
  
      // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
      public String getName() { return _name; }
      
      public int getDefense() { return _def; }
      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
      
      /*=============================================
        boolean isAlive() -- tell whether I am alive
        post: returns boolean indicated alive or dead
        =============================================*/
      public boolean isAlive() {
  	    return _hp > 0;
      }
  
  
      /*=============================================
        int attack(Monster) -- simulates attack on instance of class Monster
        pre:  Input not null
        post: Calculates damage to be inflicted, flooring at 0. 
              Calls opponent's lowerHP() method to inflict damage. 
  	    Returns damage dealt.
        =============================================*/
      public int attack( Monster opponent ) {
  
  	    int damage = (int)( (_str * _atk) - opponent.getDefense() );
  	    //System.out.println( "\t\t**DIAG** damage: " + damage );
  
  	    if ( damage < 0 )
  	      damage = 0;
  
  	    opponent.lowerHP( damage );
  
  	    return damage;
      }//end attack
  
  
      /*=============================================
        void lowerHP(int) -- lowers life by input value
        pre:  Input >= 0
        post: Life instance var is lowered by input ammount.
        =============================================*/
      public void lowerHP( int damageInflicted ) {
  	    _hp = _hp - damageInflicted;
      }
  
  
      public void HPot(){
        if (_Hpot > 0){
          _hp = _hp + 25;
        }
        else{
          System.out.println("Thou hast no more Health Potions");
        }
      }
      
      //prepare a Archer for a special attack
      public void specialize() {
      	_atk = .75;
  	    _def = 20;
      }
  
      //revert to normal mode
      public void normalize() {
  	    _atk = .4;
  	    _def = 40;
      }
  
      //describes the object
      public static String about() {
  	    return "You are a brave and courageous archer engaging in long-range combat with the monstes of this world.";
      }
  
  }//end class Archer
