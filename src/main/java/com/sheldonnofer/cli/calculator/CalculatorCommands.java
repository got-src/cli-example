package com.sheldonnofer.cli.calculator;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("calculator")
public class CalculatorCommands {

    @ShellMethod("Add two numbers together")
    public int add(int a, int b){
        return a + b;
    }

    @ShellMethod("Subtract two numbers")
    public int sub(int a, int b){
        return a - b;
    }

    @ShellMethod("Multiply two numbers")
    public int multiply(int a, int b){
        return a * b;
    }

    @ShellMethod("Divide two numbers")
    public double div(int a, int b){
        return a / b;
    }
}
