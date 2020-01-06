public class Lab4
{
    public static void turnRight()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void turnAround()
    {
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void backUp()
    {
        turnAround();
        Robot.move();
        turnAround();
    }

    public static void completeBars()
    {
        //insert instructions below
        lastCol();
        topRow();
        completeCol();
        otherCols();

    }

    public static void lastCol()
    {
        //Precondition: Robot is bottom left corner, facing right
        while(Robot.frontIsClear())
        {
            Robot.move();
        }
        Robot.turnLeft();
        //Postcondition: Robot is in bottom right corner, facing up
    }

    public static void topRow()
    {
        //Precondition: Robot is at bottom of column facing up
        while(Robot.frontIsClear())
        {
            Robot.move();
        }
        turnAround();
        //Post condition: Robot is at top of column facing down
    }

    public static void completeCol()
    {
        //Precondition: Robot is at top of column facing down
        while(Robot.frontIsClear())
        {
            if(Robot.onDark())
            {
                Robot.move();
                Robot.makeDark();
            }
            else
            {
                Robot.move();
            }
        }
        if(Robot.onDark())
        {
        }
        else
        {
            Robot.makeDark();
        }
        //Postcondition: Robot is at bottom of column facing down
    }

    public static void otherCols()
    {
        //Precondition: Robot is at bottom of column, facing down
        turnRight();
        while(Robot.frontIsClear())
        {
            Robot.move();
            turnRight();
            topRow();
            completeCol();
            turnRight();
        }
        //Postcondition: Robot is in bottom left corner, facing left
    }

    public static void testCompleteBars1()
    {
        Robot.load("bars1.txt");
        Robot.setDelay(0.025);
        completeBars();
    }

    public static void testCompleteBars2()
    {
        Robot.load("bars2.txt");
        Robot.setDelay(0.025);
        completeBars();
    }

    public static void combinePiles()
    {
        //insert instructions below

        combineAll();

    }

    public static void moveBlock()
    {
        //Precondition: Robot is on Darkened block in left column, facing up
        Robot.makeLight();
        turnAround();
        while(Robot.frontIsClear())
        {
            Robot.move();
        }
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
        while(Robot.onDark())
        {
            Robot.move();
        }
        Robot.makeDark();
        //Postcondition: Robot is on topmost darkened block in 
        //right column, facing up
    }

    public static void returnToStart()
    {
        //Precondition: Robot is on topmost darkened block in 
        //right column, facing up
        turnAround();
        while(Robot.frontIsClear())
        {
            Robot.move();
        }
        turnRight();
        Robot.move();
        turnRight();
        //Postcondition: Robot is in bottom left corner facing up
    }

    public static void combineAll()
    {
        //Precondition: Robot is in bottom left corner facing up
        while(Robot.frontIsClear())
        {
            if(Robot.onDark())
            {
                moveBlock();
                returnToStart();
            }
            Robot.move();
        }
        if(Robot.onDark())
        {
            moveBlock();
            returnToStart();
        }
        //Postcondition: Robot is in top right corner facing up
    }

    public static void testCombinePiles1()
    {
        Robot.load("piles1.txt");
        Robot.setDelay(0.025);
        combinePiles();
    }

    public static void testCombinePiles2()
    {
        Robot.load("piles2.txt");
        Robot.setDelay(0.025);
        combinePiles();
    }

    public static void connectDots()
    {
        //insert instructions below

        connectFirst();
        findPoint();

    }

    public static void connectOne()
    {
        //Precondition: Starts on unconnected darkened space
        backUp();
        Robot.makeDark();
        Robot.move();
        //Postcondition: Ends on now connected darkened space
    }

    public static void connectFirst()
    {
        //Precondition: starts on first darkened space
        if(Robot.frontIsClear())
        {
            Robot.move();
            if(Robot.frontIsClear())
            {
                Robot.move();
                if(Robot.onDark())
                {
                    connectOne();
                }
                else
                {
                    turnAround();
                    Robot.move();
                    Robot.move();
                    Robot.turnLeft();
                    if(Robot.frontIsClear())
                    {
                        Robot.move();
                        if(Robot.frontIsClear())
                        {
                            Robot.move();
                            if(Robot.onDark())
                            {
                                connectOne();
                            }
                            else
                            {
                                turnAround();
                                Robot.move();
                                Robot.move();
                                Robot.turnLeft();
                                if(Robot.frontIsClear())
                                {
                                    Robot.move();
                                    if(Robot.frontIsClear())
                                    {
                                        Robot.move();
                                        if(Robot.onDark())
                                        {
                                            connectOne();
                                        }
                                        else
                                        {
                                            turnAround();
                                            Robot.move();
                                            Robot.move();
                                            Robot.turnLeft();
                                            if(Robot.frontIsClear())
                                            {
                                                Robot.move();
                                                if(Robot.frontIsClear())
                                                {
                                                    Robot.move();
                                                    if(Robot.onDark())
                                                    {
                                                        connectOne();
                                                    }
                                                    else
                                                    {
                                                        turnAround();
                                                        Robot.move();
                                                        Robot.move();
                                                    }
                                                }}}}}}}}}}}}
    //Postcondition: Ends on 
    //second connected point

    public static void findPoint()
    {
        //Precondition: Starts on connected darkened space
        boolean finished = false;

        while(finished == false)
        {
            Robot.turnLeft();
            if(Robot.frontIsClear())
            {
                Robot.move();
                if(Robot.frontIsClear())
                {
                    Robot.move();
                    if(Robot.onDark())
                    {
                        connectOne();
                    }
                    else
                    {
                        turnAround();
                        Robot.move();
                        Robot.move();
                        Robot.turnLeft();
                        if(Robot.frontIsClear())
                        {
                            Robot.move();
                            if(Robot.frontIsClear())
                            {
                                Robot.move();
                                if(Robot.onDark())
                                {
                                    connectOne();
                                }
                                else
                                {
                                    turnAround();
                                    Robot.move();
                                    Robot.move();
                                    Robot.turnLeft();
                                    if(Robot.frontIsClear())
                                    {
                                        Robot.move();
                                        if(Robot.frontIsClear())
                                        {
                                            Robot.move();
                                            if(Robot.onDark())
                                            {
                                                connectOne();
                                            }
                                            else
                                            {
                                                turnAround();
                                                Robot.move();
                                                Robot.move();
                                                finished = true;
                                            }}}}}}}}}}}
    //Postcondition: Ends on now connected darkened space. If no more points
    //to connect, finished is set to true

    public static void testConnectDots1()
    {
        Robot.load("connect1.txt");
        Robot.setDelay(0.025);
        connectDots();
    }

    public static void testConnectDots2()
    {
        Robot.load("connect2.txt");
        Robot.setDelay(0.025);
        connectDots();
    }
}
