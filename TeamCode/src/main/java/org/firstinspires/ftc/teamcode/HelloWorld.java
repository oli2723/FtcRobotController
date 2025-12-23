package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


@Disabled
@Autonomous

public class HelloWorld extends OpMode {
boolean flyWheel = false;

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        {
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", gamepad2.left_stick_y);

    }
    }

}
