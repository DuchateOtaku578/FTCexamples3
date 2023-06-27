package org.firstinspires.ftc.teamcode.autonomos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.configuracion.RobotConfigMaster;
import org.firstinspires.ftc.teamcode.domain.Chasis;

@Autonomous(name="Chasis autonomo ", group = "PushBot")

public class ChasisAutonomo extends LinearOpMode {

    @Override
    public void runOpMode(){
        //declaras las configuraciones
        RobotConfigMaster robot = new RobotConfigMaster();
        robot.init(hardwareMap,telemetry);
        Chasis chasis = new Chasis(robot.motores);
        chasis.init();
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){
            //todos los movimientos del robot en bucle aqui
            chasis.moverseEnfrente(0.5);
            telemetry.addLine("motor moviendose");
            sleep(1000);
            chasis.moverseAtras(0.5);
            telemetry.addLine("cambio de giro de motor");
        }

    }
}
