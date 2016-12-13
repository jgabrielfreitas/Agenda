package stone.agenda;

import stone.agenda.models.CalendarEvent;
import stone.agenda.models.IDayItem;

import java.util.Calendar;

public interface CalendarPickerController {
    void onDaySelected(IDayItem dayItem);

    void onEventSelected(CalendarEvent event);

    void onScrollToDate(Calendar calendar);
}
