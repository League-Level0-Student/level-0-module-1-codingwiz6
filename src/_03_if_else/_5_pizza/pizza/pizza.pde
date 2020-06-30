PImage cheese;
void setup() {
    size(500,500);
    cheese=loadImage("cheese.jpg");
   cheese.resize(30,30); 
}
void draw() {
    fill(#FFCF4B);
    ellipse(250,250,200,200);
    fill(#FF2C2C);
    ellipse(250,250,150,150);
fill(#FFF52C);
ellipse(250,250,130,130);
image(cheese,250,250);

}
