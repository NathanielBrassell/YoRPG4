public class Dragon extends Character{
  
  public Dragon(){
    
    _str = 25 + ((int)(Math.random() * 55));
    _hp = 160;
    _def = 30;
    _atk = 1.2;
    
  }
  
  public String about(){
    String ret = "";
    ret += "A Dragon is the most feared enemy of all adventures.\n";
    ret += "They have increased strngth and atack rate, and their scales are harder than any armour.";
    return ret;
  }
  
  public void specialize() {}

  public void normalize() {}
  
  public void Stats() {}
}
