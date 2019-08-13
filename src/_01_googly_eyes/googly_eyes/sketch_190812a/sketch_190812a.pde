void setup(){
  PImage face =loadImage("googlyEyes.png");
  
  size(800,600);
  face.resize(800,600);
  background(face);


}

void draw(){
int x = mouseX;
int y = mouseY;
  
  fill(#FCFCFC);
ellipse(210,303,75,75);
ellipse(370,303,75,75);
fill(#000000);
if(x > 210 + 75){
ellipse(210,303,20,20);
}
if(x > 210 - 75){
ellipse(370,303,20,20);
}
ellipse(x,y,20,20);
//ellipse(x,y,20,20);

}
