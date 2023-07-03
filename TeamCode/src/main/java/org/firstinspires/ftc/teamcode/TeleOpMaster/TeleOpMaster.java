package org.firstinspires.ftc.teamcode.TeleOpMaster;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.configuracion.RobotConfigMaster;
import org.firstinspires.ftc.teamcode.domain.Chasis;

@TeleOp(name="TeleOpManualcjsufsush", group="PushBot")

public class TeleOpMaster extends LinearOpMode {

    @Override
    public void runOpMode(){
        //inicializas las configuraciones
        RobotConfigMaster robot = new RobotConfigMaster();
        robot.init(hardwareMap,telemetry);
        Chasis chasis = new Chasis(robot.motores);
        chasis.init();
        telemetry.update();

        //declaras las variables a usar


        double incremento;

        final double velocidad = 0.5;
        final double anular = 0.15;

        waitForStart();

        while(opModeIsActive()){

            boolean stickIzq = gamepad1.left_stick_button;

            boolean stickDer = gamepad1.right_stick_button;
            //botones de los controles
            double stickIzquierdoY = -gamepad1.left_stick_y;
            double stickIzquierdoX = gamepad1.left_stick_x;

            double stickDerechoY = -gamepad1.right_stick_y;
            double stickDerechoX = gamepad1.right_stick_x;


            double stickIzquierdoY_2 = -gamepad2.left_stick_y;
            double stickIzquierdoX_2 = gamepad2.left_stick_x;

            double stickDerechoY_2 = -gamepad2.right_stick_y;
            double stickDerechoX_2 = gamepad2.right_stick_x;

            boolean a = gamepad1.a;
            boolean b = gamepad1.b;
            boolean x = gamepad1.x;
            boolean y = gamepad1.y;

            //operador para el turbo
            incremento = (stickIzq || stickDer) ? 1 : 0;

            //datos de la velocidad en el telemetry
            if(stickDer || stickIzq){
                telemetry.addLine("VELOCIDAD AL TOPE");
            }else{
                telemetry.addLine("VELOCIDAD MODERADA");
            }

            //controles del chasis
            if(stickIzquierdoY > 0.5){
                chasis.moverseAtras(velocidad + incremento);
            } else if (stickIzquierdoY < -0.5){
                chasis.moverseEnfrente(velocidad + incremento);
            } else if (stickIzquierdoX > 0.5){
                chasis.moverseIzquierda(velocidad + incremento);
            } else if (stickIzquierdoX < -0.5){
                chasis.moverseDerecha(velocidad + incremento);
            } else if (stickDerechoX > 0.5){
                chasis.girarDerecha(velocidad + incremento);
            } else if (stickDerechoX < -0.5){
                chasis.girarIzquierda(velocidad+incremento);
            } else if (stickIzquierdoY > 0.5 && gamepad1.dpad_right==true) {
                chasis.moverDiagonalDerEnf(velocidad + incremento, anular);
            } else if (stickIzquierdoY > 0.5 && (gamepad1.dpad_left == true)) {
                chasis.moverDiagonalIzqEnf(velocidad+incremento, anular);
            } else if (stickIzquierdoY < -0.5 && (gamepad1.dpad_right == true)) {
                chasis.moverDiagonalDerAtr(velocidad + incremento, anular);
            } else if (stickIzquierdoY < -0.5 && (gamepad1.dpad_left== true)) {
                chasis.moverDiagonalIzqAtr(velocidad + incremento, anular);
            } else chasis.parar();

            telemetry.addData("derechita uguuguguguug",gamepad1.dpad_right);
            telemetry.addData("left ugu, angloparlante", gamepad1.dpad_left);
            telemetry.update();






            
        }

    }

}
