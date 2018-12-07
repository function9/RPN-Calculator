import java.lang.*;
import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//////// Extend the class Stack with Operation on complex
//////////////////////////////////////////////////////////
class StackCalc extends Stack{

    //////// variables (to be completed if needed)
    
    

    /////////////// Constructor
    public StackCalc(int maxSize){
	super(maxSize);
    } 

    
    /////////////////////////////////  
    ////////////// Operations
    /////////////////////////////////
    
    ///// addition  
    public void add(){
	if (size()>=2){ 
	    Complex z1=(Complex) pop();
	    Complex z2=(Complex) pop();
	    push(z1.plus(z2));
	}
    }

  	
    //// return pi number
    public void pi(){
	if (!isFull()) push(new Complex(Math.PI,0));
    }

    
    ////// TO COMPLETE

   

    //////////////////////////////////////////
    //// Selection- RPN Operations on Stack
    /////////////////////////////////////////
    public void rpnCommand(String data){    

	//boolean putinqueue=true;
	
	switch(data)
	    {
	    case("+"): 
		add(); 
		break;
          
		////// TO COMPLETE
	 
	    default: // data is not an operator, it is a complex number (or variable definition for App2,3,4)
		
		////// TO COMPLETE

		push(Complex.valueOf(data));

                ////// TO COMPLETE
		
		break;
	      
	    }
	    
    }

    //////////////////////////////////////////
    //// OTHER METHODS
    /////////////////////////////////////////    
    
    
    ////// TO COMPLETE
    


    
}	



