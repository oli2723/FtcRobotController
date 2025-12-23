package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.opMode;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class GamePadPractice extends opMode {
@Override public void init (){

}

@Override public void loop(){
double diffXJoySticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;
telemetry.addData("right x", gamepad1.right_stick_x );
telemetry.addData("right y", gamepad1.right_stick_y);
telemetry.addData("b button", gamepad1.b);
telemetry.addData(diffXJoySticks);
telemetry.addData("sums of the triggers", sumTriggers);
}




}
