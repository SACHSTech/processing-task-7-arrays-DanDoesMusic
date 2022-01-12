import processing.core.PApplet;

public class Sketch extends PApplet {
 int num = 50;
 int []  Rectangle = new int [num];
int[] x = new int[num];
int[] y = new int[num];
float[] circleY = new float[25];
  public void settings(){
    size (400,400);
  }
	
	

public void setup() {

  noStroke();
  fill(255, 102);

  for (int i = 0; i < circleY.length; i++) {
    circleY[i] = random(height);
}
}

public void draw() {
  background(0);
  // Shift the values to the right
  for (int i = num-1; i > 0; i--) {
    x[i] = x[i-1];
    y[i] = y[i-1];
  }
  // Add the new values to the beginning of the array
  x[0] = mouseX;
  y[0] = mouseY;
  // Draw the circles
  for (int i = 0; i < num; i++) {
    ellipse(x[i], y[i], 30 - i , 30 - i);
  }
    for (int i = 0; i < circleY.length; i++) {
    float circleX = width * i / circleY.length;
    fill(255,0,0);
    ellipse(circleX, circleY[i], 5, 5);

    circleY[i] ++;


    if (circleY[i] > height) {
      circleY[i] = 0;
          Rectangle[i]++;
    }
  }
for (int i = 0; i < 20 ; i++ ){
  rect(i * 20, 400, 25, Rectangle[i] * -2 );
}
}
}