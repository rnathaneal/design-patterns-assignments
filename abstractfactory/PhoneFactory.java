package main.java.net.media.training.designpattern.abstractfactory;

import net.media.training.designpattern.abstractfactory.Battery;
import net.media.training.designpattern.abstractfactory.MotherBoard;
import net.media.training.designpattern.abstractfactory.Processor;
import net.media.training.designpattern.abstractfactory.Screen;

public interface PhoneFactory {
    
    public MotherBoard getMotherBoard();

    public Processor getProcessor();

    public Battery getBattery();

    public Screen getScreen();

    public Case getCase();
}
