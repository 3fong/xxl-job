package com.xxl.job.cron;

import com.xxl.job.admin.core.cron.CronExpression;
import org.junit.Test;


/**
 * @author liulei
 * @Description
 * @create 2021/12/10 20:20
 */
public class CronTest {

    @Test
    public void parseTest(){
        boolean expression = CronExpression.isValidExpression("0 0 1 9-9 12-12 ? 2021-2021");
        System.out.println(expression);
    }
}
