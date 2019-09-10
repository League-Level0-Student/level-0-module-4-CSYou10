PImage donkey;
PImage tail;
void setup() {
size(267, 189);
donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png");
tail.resize(50,50);
}
void draw() {
background (donkey);
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30);
rect(454, 75, 40, 40);
if(dist(0, 0, mouseX, mouseY) > 30){
background(#FFFFFF);
}
if(mousePressed){
if(dist(0,0, mouseX, mouseY) < 30){
System.out.println(mouseX + " "+ mouseY);
}

}

}
