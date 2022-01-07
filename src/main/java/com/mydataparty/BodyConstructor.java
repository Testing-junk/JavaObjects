package com.mydataparty;

public class BodyConstructor {

        public void createBody() {
        BodyArm leftArm = new BodyArm();
        leftArm.length = 5;
        BodyArm rightArm = new BodyArm();
        rightArm.length = 5;


        BodyCore core = new BodyCore("Rectangle");
        core.numberOfSides = 4;
        core.height = 5;
        core.width = 10;

        BodyHead head = new BodyHead();

        BodyLeg leftLeg = new BodyLeg();
        leftLeg.length = 10;
        BodyLeg rightLeg = new BodyLeg();
        rightLeg.length = 10;
       }


}
