  /*=============================================
    class Archer -- the second protagonist of Ye Olde RPG
    =============================================*/
  
  public class Archer extends Character {
  
      // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
      private String _name = "Robbin Hood";
      private int _hp, _str, _def;
      private double _atk;
      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  
      /*=============================================
        default constructor
        pre:  instance vars are declared
        post: initializes instance vars.
        =============================================*/
      public Archer() {
  	    _hp = 100;
  	    _str = 70;
  	    _def = 70;
  	    _atk = .3; 
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
  	    return "You are a brave and courageous archer engaging in long-range combat with the monsters of this world.";
      }
  
  }//end class Archer
