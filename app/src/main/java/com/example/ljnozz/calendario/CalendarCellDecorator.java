package com.example.ljnozz.calendario;

import com.squareup.timessquare.CalendarCellView;

import java.util.Date;

public interface CalendarCellDecorator {
  void decorate(CalendarCellView cellView, Date date);
}
