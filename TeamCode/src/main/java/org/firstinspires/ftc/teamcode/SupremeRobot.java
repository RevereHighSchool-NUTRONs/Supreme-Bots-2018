package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.BBLibrary.Hardware.BBMotor;
import org.firstinspires.ftc.teamcode.SupremeSubsystems.SupremeDrivetrain;
import org.firstinspires.ftc.teamcode.SupremeSubsystems.SupremeElevator;

/**
 * Created by Josh on 10/12/2017.
 */

public class SupremeRobot {

    //Declaring drivetrain motors and objects
    public BBMotor leftFrontDrive;
    public BBMotor rightFrontDrive;
    public SupremeDrivetrain supremeDrive;

    //Declaring elevator motor and object
    public BBMotor eM;
    public SupremeElevator elevator;

    SupremeMap robotMap;

    /**
     * BB18 Robot class
     * @param hardwareMap hardwareMap from op-mode class
     */
    public SupremeRobot(HardwareMap hardwareMap) {

        robotMap = new SupremeMap(); //Declaring map class
        robotMap.init(hardwareMap); //Receiving passed through map class for creating custom hardware

        //Assigning Drivetrain Motors and Object
        leftFrontDrive = new BBMotor(robotMap.leftFrontDrive, BBMotor.MotorType.RevHDHex);
        rightFrontDrive = new BBMotor(robotMap.rightFrontDrive, BBMotor.MotorType.RevHDHex);
        supremeDrive = new SupremeDrivetrain(leftFrontDrive, rightFrontDrive);

        //Assigning Elevator Motor and Object
        eM = new BBMotor(robotMap.elevator, BBMotor.MotorType.RevHDHex);
        elevator = new SupremeElevator(eM, robotMap.leftGrab, robotMap.rightGrab, robotMap.jewel);
    }

}
