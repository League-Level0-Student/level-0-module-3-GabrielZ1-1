
void setup() {
 
  // set the size of your sketch
  
 size(500,500);
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  for(int i=1; i<=10; i++){
 
    //Use an if statement and remainder to alternate the color of your rings.
  if(i % 2 == 0){
   
   fill(255,0,0);
   }
   else if(i % 2 == 1){
    fill(0, 0, 255); 
   }
    
    
    
    ellipse(250,250,450-35*i,450-35*i);
   
  

  }
}
