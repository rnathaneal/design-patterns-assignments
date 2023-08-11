package main.java.net.media.training.designpattern.abstractfactory;

import net.media.training.designpattern.abstractfactory.Battery;
import net.media.training.designpattern.abstractfactory.IphoneMotherBoard;
import net.media.training.designpattern.abstractfactory.IphoneProcessor;
import net.media.training.designpattern.abstractfactory.MotherBoard;
import net.media.training.designpattern.abstractfactory.Processor;
import net.media.training.designpattern.abstractfactory.Screen;

public class IphoneFactory implements PhoneFactory{
    
    public MotherBoard getMotherBoard(){
        return new IphoneMotherBoard();
    };

    public Processor getProcessor(){
        return new IphoneProcessor();
    };

    public Battery getBattery(){
        return new Battery();
    };

    public Screen getScreen(){
        return new Screen();
    };
}
