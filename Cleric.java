public class Cleric extends Character{
  
  public Cleric(){
    
    _str = 10;
    _hp = 90;
    _def = 30;
    _atk = 0.3;
  }
  
  public void Heal(){
    _hp = _hp + (20 + ((int)Math.random() * 30));
  }
  
  public void specialize(){
    _def = 20;
    _atk = 0.5;
  }
  
  public void normalize(){
    _def = 30;
    _atk = 0.3;
  }
  
}