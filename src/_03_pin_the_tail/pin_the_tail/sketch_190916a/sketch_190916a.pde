PImage donkey;
PImage tail;
int saveX;
int saveY;
boolean clicked = false;
void setup() {
size(267, 189);
donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png");
tail.resize(50,50);
}
void draw() {
background (donkey);
if (clicked == true) {

image(tail, saveX, saveY);
}else{
image(tail, mouseX, mouseY);
}
rect(0, 0, 30, 30);
rect(170, 80, 10, 10);
if(dist(0, 0, mouseX, mouseY) > 30){
background(#FFFFFF);
}
if(mousePressed){
if(dist(170,80, mouseX, mouseY) < 30){
saveX = mouseX; saveY = mouseY; System.out.println(mouseX + " "+ mouseY);
System.out.println(saveX + saveY);
clicked = true;
}

}

}
