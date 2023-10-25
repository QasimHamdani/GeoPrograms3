public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 1;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        //"call square in the go method"
        house();
        octagon();
        square();
        man();


    }


    public void square() {
        plane.teleport(500,20);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void octagon() {
        plane.teleport(400, 400);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(0, 200, 0);
        plane.move(100);

    }

        public void house(){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
        plane.turn(135);
        plane.move(78);
        plane.turn(275);
        plane.move(74);
    }



    public void man(){
        plane.teleport(80, 500);
        plane.circle(4);
        plane.teleport(190, 500);
        plane.circle(4);
        plane.teleport(290, 500);
        plane.circle(4);
    }



    }




/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/