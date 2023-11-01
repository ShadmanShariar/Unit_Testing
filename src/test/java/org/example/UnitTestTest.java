package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest {

    @Test //Passed
    void getPageCounteTest(){
        UnitTest object = new UnitTest();
        object.setValue(5,12,50);
        assertEquals(12,object.getPageCount());
    }
    @Test // Wrong Answer
    void getPageCounteTest2(){
        UnitTest object = new UnitTest();
        object.setValue(5,12,50);
        assertEquals(13,object.getPageCount());
    }
    @Test // Wrong Answer
    void getPageCounteTest3(){
        UnitTest object = new UnitTest();
        object.setValue(5,12,50);
        assertEquals(11,object.getPageCount());
    }
    ////////////////////////////////////////////////////////////
    @Test //Passed
    void addPageTest(){
        UnitTest object = new UnitTest();
        assertEquals(10,object.addPage(10,12));
    }
    @Test // Wrong Answer
    void addPageTest2(){
        UnitTest object = new UnitTest();
        assertEquals(11,object.addPage(10,12));
    }
    @Test // Wrong Answer
    void addPageTest3(){
        UnitTest object = new UnitTest();
        assertEquals(12,object.addPage(10,12));
    }
    ////////////////////////////////////////////////////////////
    @Test //Passed
    void addPage2Test(){
        UnitTest object = new UnitTest();
        object.page = 10;
        assertEquals(10,object.addPage());
    }
    @Test // Wrong Answer
    void addPage2Test2(){
        UnitTest object = new UnitTest();
        object.page = 10;
        assertEquals(11,object.addPage());
    }
    @Test // Wrong Answer
    void addPage2Test3(){
        UnitTest object = new UnitTest();
        object.page = 10;
        assertEquals(12,object.addPage());
    }
    ////////////////////////////////////////////////////////////
    @Test // Passed
    void getActivePageTest(){
        UnitTest object = new UnitTest();
        assertEquals(-1,object.getActivePage(null));
    }
   ////////////////////////////////////////////////////////////
   @Test // Passed
   void getTitleTest(){
       UnitTest object = new UnitTest();
       assertEquals("Test",object.getTitleToolTip("Test"));
   }
   @Test // Wrong Answer
    void getTitleTest2(){
        UnitTest object = new UnitTest();
        assertEquals("Test",object.getTitleToolTip(null));
    }
    ////////////////////////////////////////////////////////////
    @Test // Passed
    void setPartTest(){
        UnitTest object = new UnitTest();
        assertEquals("New File",object.setPartName("New File"));
    }
    @Test // Wrong Answer
    void setPartTest2(){
        UnitTest object = new UnitTest();
        assertEquals("New File",object.setPartName(null));
    }
    ////////////////////////////////////////////////////////////
    @Test // Passed
    void setDefaultPartNameTest(){
        UnitTest object = new UnitTest();
        object.compatibilityTitleListener= "New File";
        assertEquals("New File",object.setDefaultPartName());
    }
    @Test // Wrong Answer
    void setDefaultPartNameTest2(){
        UnitTest object = new UnitTest();
        object.compatibilityTitleListener = null;
        assertEquals("New File",object.setDefaultPartName());
    }

}