package company;

public class Consumer extends Thread {
  Company c;
 
Consumer(Company c){
 this.c=c;
}  

  
    
    
public void run(){
 while(true){
 try{    
  this.c.consume_item();
  
   Thread.sleep(1500 );
  }catch(Exception e){
   e.printStackTrace();
  }
 }   
}    
    
}
