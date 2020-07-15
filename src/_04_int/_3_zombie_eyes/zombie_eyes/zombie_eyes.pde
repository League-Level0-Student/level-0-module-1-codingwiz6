
void setup() {
PImage cat =loadImage("catface.jpg");
size(200,200);
cat.resize(200,200);
image(cat,0,0);
}
void draw() {
 fill(mouseX,mouseY,240);
ellipse(75,115,25,25);

ellipse(120,115,25,25);

fill(0);
ellipse(120,115,5,5);
ellipse(75,115,5,5);
}
