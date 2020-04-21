package lambdaExpression;
interface Speakable{  
    public String say(String name);  
}  
  
public class LambdaExpressionExample{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
    	Speakable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Speakable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
}  