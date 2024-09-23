package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import static android.os.SystemClock.sleep;
@Autonomous
public class RandomAutoThing extends LinearOpMode {

    public DcMotorEx fl = null;
    public DcMotorEx bl = null;
    public DcMotorEx fr = null;
    public DcMotorEx br = null;

    @Override
    public void runOpMode() {

        fl = hardwareMap.get(DcMotorEx.class, "leftFront");
        bl = hardwareMap.get(DcMotorEx.class, "leftBack");
        fr = hardwareMap.get(DcMotorEx.class, "rightFront");
        br = hardwareMap.get(DcMotorEx.class, "rightBack");

        fl.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        bl.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        fr.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        br.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);

        br.setDirection(DcMotorEx.Direction.REVERSE);   

        fl.setPower(-0.5);
        bl.setPower(0.5);
        br.setPower(-0.5);
        fr.setPower(0.5);
        sleep(950);
        fl.setPower(0);
        bl.setPower(0);
        br.setPower(0);
        fr.setPower(0);
        sleep(250);
    }
}