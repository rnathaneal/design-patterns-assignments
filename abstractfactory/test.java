package main.java.net.media.training.designpattern.abstractfactory;

import net.media.training.designpattern.abstractfactory.IphoneMotherBoard;
import net.media.training.designpattern.abstractfactory.IphoneScreen;
import net.media.training.designpattern.abstractfactory.AndroidCase;
import net.media.training.designpattern.abstractfactory.AndroidMotherBoard;
import net.media.training.designpattern.abstractfactory.AndroidProcessor;
import net.media.training.designpattern.abstractfactory.AndroidScreen;
import net.media.training.designpattern.abstractfactory.Battery;
import net.media.training.designpattern.abstractfactory.Case;
import net.media.training.designpattern.abstractfactory.IphoneCase;
import net.media.training.designpattern.abstractfactory.MotherBoard;
import net.media.training.designpattern.abstractfactory.Processor;
import net.media.training.designpattern.abstractfactory.Screen;

public class test {
    public static void main(String[] args) {
        
        PhoneFactory iphoneFactory = new IphoneFactory();
        MotherBoard motherBoard = iphoneFactory.getMotherBoard();
        motherBoard.attachBattery(iphoneFactory.getBattery());
        motherBoard.attachProcessor(iphoneFactory.getProcessor());
        Screen screen = new IphoneScreen();
        Case phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        System.out.println(phoneCase);

        PhoneFactory androidFactory = new AndriodFactory();
        MotherBoard androidMotherBoard = androidFactory.getMotherBoard();
        androidMotherBoard.attachBattery(androidFactory.getBattery());
        androidMotherBoard.attachProcessor(androidFactory.getProcessor());
        Screen androidScreen = new AndroidScreen();
        Case androidPhoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(androidScreen);
        System.out.println(androidPhoneCase);
    }
}
