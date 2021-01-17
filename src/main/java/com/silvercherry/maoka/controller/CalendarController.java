package com.silvercherry.maoka.controller;


import com.silvercherry.maoka.dao.domain.Calendar;
import com.silvercherry.maoka.dao.domain.RespBean;
import com.silvercherry.maoka.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @GetMapping("/calendar")
    public RespBean getCalendar(@RequestParam(defaultValue = "") String date) {
        if (date.equals("")) {
            long l = System.currentTimeMillis();
            Date now = new Date(l);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = simpleDateFormat.format(now);
        }
        Calendar calendar = calendarService.getCalendar(date);
        System.out.print(calendar.toString());
        RespBean respBean = RespBean.build();
        respBean.setObj(calendar);
        return respBean;

    }

}
