package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class ProjectDisplayItemTest {

    @Test
    public void isSameItemTest(){
        ProjectDisplayItem pjd;

        pjd=new ProjectDisplayItem("WuTangFigurines", 240.23);
        Assert.assertTrue(pjd.isSameItem("WuTangFigurines"));
        Assert.assertFalse(pjd.isSameItem("BatManFigurines"));
    }
}
