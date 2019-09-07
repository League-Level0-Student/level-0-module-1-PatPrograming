    void setup(){
       PImage face = loadImage("creeper.jpg");
image(face, 0, 0);
size(700, 700);
face.resize(700, 700);
    }

    void draw(){
fill(255,mouseX,mouseY);
      ellipse(310, 200, 150, 150);
      fill(0,0,0);
      ellipse(310, 200, 50, 50);
fill(255,mouseX,mouseY);
      ellipse(500, 200, 150, 150);
fill(0,0,0);
      ellipse(500, 200, 50, 50);
    }
