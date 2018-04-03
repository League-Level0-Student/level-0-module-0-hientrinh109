import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
Robot h3d3=new Robot();
 h3d3.setX(30);
h3d3.setPenColor(Color.red);
h3d3.setPenWidth(10);
h3d3.penDown();
h3d3.setSpeed(20);
h3d3.move(200);
h3d3.move(-100);
h3d3.turn(90);
h3d3.move(150);
h3d3.turn(90);
h3d3.move(100);
h3d3.move(-200);



}


}
