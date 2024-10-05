package org.firstinspires.ftc.teamcode.DriverOpmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class ServoTest extends LinearOpMode {
    public Servo rotServo = null; //hardware mapping only a servo: treated as a normal servo

    public void runOpMode() {
        waitForStart();
        rotServo = hardwareMap.get(Servo.class, "rotServo");
        while (opModeIsActive()) {
            if(gamepad1.b) { //b and a just change positions
                rotServo.setPosition(1);
                sleep(1000);
            }
            if(gamepad1.a) {
                rotServo.setPosition(0);
                sleep(1000);
            }
        }
    }
}
