 void setup(){
        size(400,600);

    }
int x;
int y;
    void draw(){
        fill(#D8A574);
      ellipse(200, 300, 300, 300);
fill(#D8453D);
      ellipse(200, 300, 270, 270);
      fill(#FCF3A1);
      ellipse(200, 300, 250, 250);
      PImage gpepper = loadImage("gpepper.jpg");
PImage onion = loadImage("onion.png");
onion.resize(100, 100);
x=mouseX;
y=mouseY;
if(mousePressed){
image(gpepper, x, y);
image(onion, 120, 200);
}
    }
                            
