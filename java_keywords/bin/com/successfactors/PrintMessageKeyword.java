package com.successfactors;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class PrintMessageKeyword {

    @RobotKeyword("Print Message")
    @ArgumentNames({"message"})
    public void printMessage(String message) {
        System.out.println(message);
    }
}
