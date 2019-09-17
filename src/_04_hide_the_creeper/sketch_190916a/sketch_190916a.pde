int creeperX = 100;
int creeperY = 200;
PImage creeper;     //at the top of your program
void setup() {
  size(1000, 1000);
  PImage minecraft = loadImage("minecraft.png");     //in setup method
  minecraft.resize(width, height);          //in setup method
  background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(10, 10);     //in setup method
}

void draw() {
  image(creeper, creeperX, creeperY);     //in draw method
  if (mousePressed) {
    ellipse (mouseX, mouseY, 10, 10);
    fill (#FA0505);
    if (isNear(mouseX, creeperX)) {
      fill (#05FA13);
    }

    if (isNear(mouseY, creeperY)) {
      fill (#05FA13);
    }
  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
  return true;
  else
    return false;
}
