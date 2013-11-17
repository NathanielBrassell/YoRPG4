public class Monster2 extends Character{

  public Monster2(){
    
    _str = 30 + ((int)(Math.random() * 45));
    
    _hp = 120;
    
    _def = 15;
    
    _atk = 1.2;
    
    
  }
  
  public String about(){
    
    return "A Monster that uses its brute strength to make up for its lack of defensive know-how";
    
  }
  
}
