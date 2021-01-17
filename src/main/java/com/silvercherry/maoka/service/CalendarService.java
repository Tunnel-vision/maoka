package com.silvercherry.maoka.service;


import com.silvercherry.maoka.dao.domain.Calendar;
import com.silvercherry.maoka.mapper.CalendarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

    @Autowired
    CalendarMapper calendarMapper;

    public Calendar getCalendar(String date) {
        Calendar calendarBySelective = calendarMapper.getCalendarBySelective(date);
        return calendarBySelective;
    }

}
