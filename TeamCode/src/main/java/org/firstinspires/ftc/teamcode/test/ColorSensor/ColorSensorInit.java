package org.firstinspires.ftc.teamcode.test.ColorSensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="PruebaSensorColor" , group="PushBot")
public class ColorSensorInit extends LinearOpMode {

    PruebaColorSensor robot = new PruebaColorSensor();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap, telemetry);
        ColorSensorDomain sensorcolor = new ColorSensorDomain(robot.colorsensor);
        telemetry.addLine("Senosor inicializado");
        telemetry.update();
        sleep(1000);



        while (opModeIsActive()) {


        }
    }
}
