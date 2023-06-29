package org.firstinspires.ftc.teamcode.test.ColorSensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

@TeleOp(name="PruebaSensorColor" , group="PushBot")
public class ColorSensorInit extends LinearOpMode {

    public ColorSensor colorsensor;



    @Override
    public void runOpMode() {

        colorsensor = hardwareMap.get(ColorSensor.class,"sensor_color");



        telemetry.addLine("Sensor inicializado");
        telemetry.update();
        sleep(1000);



        while (opModeIsActive()) {
        telemetry.addData("color azul: ",colorsensor.blue() );
        telemetry.addData("color rojo: ",colorsensor.red() );
        telemetry.addData("color green: ",colorsensor.green() );
        telemetry.addData("color Alpha como yo auuuuuu", colorsensor.alpha());

            telemetry.update();
    }

  }
}
