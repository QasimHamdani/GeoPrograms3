public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        rowOfSmallSquares();
        columnOfSmallSquares();
        gridOfSmallSquares();

        //for(int s=0; s<5; s=s+1)
        //System.out.println("Sprint");
        //for(int p=0; p<10; p=p+1)
    }

    public void rowOfSmallSquares() {
        plane.pausetime = 0;
        for (int s = 0; s < 500; s = s + 10) {
            System.out.println(s);
            plane.teleport(s, 10);
            plane.trailWidth = 5;
            //in this method, create a long row of 10 pixel by 10 pixel squares
            //put your loop here
        }
    }

    public void columnOfSmallSquares() {
        for (int j = 0; j < 100; j = j + 10) {
            System.out.println(j);
            plane.teleport(10, j);

            //in this method, create a long column of 10 pixel by 10 pixel squares
            plane.trailWidth = 5;

            //put your loop here
        }
    }

    public void gridOfSmallSquares() {
        plane.trailWidth = 5;
        for (int x = 0; x < 900; x = x + 10) {
            for (int h = 0; h < 800; h = h + 10) {
                System.out.println(x);
                plane.setColor(100, x / 4, 230);
                plane.teleport(x, h);
                plane.square(10);


                //in this method, loop one of your previous two methods
                //your goal is to create a grid of squares
                //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
                //put your loop here

            }
        }
    }
}