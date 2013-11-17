public class Sage extends Character{
  
    String _name = "";

    public Sage(String name){

        _name = name;
        _hp = 150;
        _str = 85;
        _def = 60;
        _atk = 0.5;

    }

    public String about(){
        return "A Sage uses his wisdom, knowledge of nature and mystical powers to defeat powers of evil.";
    }
    
    public void specialize(){
            _def = 40;
            _atk = 0.8;
    }
    
    public void normalize(){
            _def = 60;
            _atk = 0.5;
    }
  
}
