void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(1848, 1158);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      
      // println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”
  if(mousePressed){
 println("X: " + mouseX + " Y: " + mouseY);
    if(mouseX < 515 && mouseY < 890 && mouseX > 480 && mouseY > 840){
 println("Waldo found!");
   playWoohoo();
 }else{
 playDoh();
 }
 
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop(); 
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
