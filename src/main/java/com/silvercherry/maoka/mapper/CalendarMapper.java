package com.silvercherry.maoka.mapper;


import com.silvercherry.maoka.dao.domain.Calendar;

public interface CalendarMapper {

    Calendar getCalendarBySelective(String date);

}
