package org.firstinspires.ftc.teamcode.test.AutonomoPrueba;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AutonomoSensor {
    public DcMotor enfrenteDer;
    public DcMotor enfrenteIzq;
    public DcMotor atrasDer;
    public DcMotor atrasIzq;

    public DcMotor[] motores = {enfrenteDer,enfrenteIzq,atrasDer,atrasIzq};

    public AutonomoSensor(){

    }

    HardwareMap hw;


}
