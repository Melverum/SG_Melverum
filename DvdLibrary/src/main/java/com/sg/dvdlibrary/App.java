/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DvdLibraryController;
import com.sg.dvdlibrary.dao.DvdLibraryDao;
import com.sg.dvdlibrary.dao.DvdLibraryDaoFileImpl;
import com.sg.dvdlibrary.ui.DvdLibraryView;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DvdLibraryController controller =
                ctx.getBean("controller", DvdLibraryController.class);
        controller.run();

//        UserIO myIo = new UserIOConsoleImpl();
//        DvdLibraryView myView = new DvdLibraryView(myIo);
//        DvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
//        DvdLibraryController controller = new DvdLibraryController(myDao, myView);
//        controller.run();
}
}