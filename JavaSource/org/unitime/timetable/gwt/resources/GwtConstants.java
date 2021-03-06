/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.gwt.resources;

/**
 * @author Tomas Muller
 */
public interface GwtConstants extends Constants {
	
	@DefaultStringValue("4.1")
	@DoNotTranslate
	String version();

	@DefaultStringValue("&copy; 2008 - 2016 The Apereo Foundation")
	@DoNotTranslate
	String copyright();
	
	@DefaultBooleanValue(true)
	@DoNotTranslate
	boolean useAmPm();

	@DefaultBooleanValue(false)
	@DoNotTranslate
	boolean firstDayThenMonth();

	@DefaultStringArrayValue({"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"})
	String[] days();

	@DefaultStringValue("MM/dd/yyyy")
	String eventDateFormat();
	
	@DefaultStringValue("MM/dd")
	String eventDateFormatShort();

	@DefaultStringValue("MM/dd, yyyy")
	String eventDateFormatLong();

	@DefaultStringValue("EEE MM/dd, yyyy")
	String meetingDateFormat();
	
	@DefaultStringValue("EEE MM/dd")
	String examPeriodDateFormat();
	
	@DefaultStringArrayValue({ "EEE", "MM/dd" })
	String[] examPeriodPreferenceDateFormat();
	
	@DefaultStringValue("MM/dd/yyyy hh:mmaa")
	String timeStampFormat();
	
	@DefaultStringValue("MM/dd hh:mmaa")
	String timeStampFormatShort();
	
	@DefaultIntValue(3)
	@DoNotTranslate
	int eventSlotIncrement();
	
	@DefaultIntValue(90)
	@DoNotTranslate
	int eventStartDefault();
	
	@DefaultIntValue(210)
	@DoNotTranslate
	int eventStopDefault();
	
	@DefaultIntValue(12)
	@DoNotTranslate
	int eventLengthDefault();
	
	@DefaultIntValue(10000)
	@DoNotTranslate
	int maxMeetings();
	
	@DefaultStringArrayValue({"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"})
	String[] longDays();
	
	@DefaultStringArrayValue({"M", "T", "W", "Th", "F", "S", "Su"})
	String[] shortDays();
	
	@DefaultStringValue("midnight")
	String timeMidnight();

	@DefaultStringValue("midnight")
	String timeMidnightEnd();

	@DefaultStringValue("noon")
	String timeNoon();
	
	@DefaultStringValue("all day")
	String timeAllDay();
	
	@DefaultStringValue("pm")
	String timePm();
	
	@DefaultStringValue("am")
	String timeAm();
	
	@DefaultStringValue("p")
	String timeShortPm();
	
	@DefaultStringValue("a")
	String timeShortAm();

	@DefaultStringArrayValue({ "h", "hr", "hrs", "hour", "hours" })
	String[] parseTimeHours();

	@DefaultStringArrayValue({ "m", "min", "mins", "minute", "minutes" })
	String[] parseTimeMinutes();

	@DefaultStringArrayValue({ "am", "a" })
	String[] parseTimeAm();

	@DefaultStringArrayValue({ "pm", "p" })
	String[] parseTimePm();
	
	@DefaultStringArrayValue({ "noon" })
	String[] parseTimeNoon();

	@DefaultStringArrayValue({ "midnight" })
	String[] parseTimeMidnight();

	@DefaultStringValue("Daily")
	String daily();
	
	@DefaultStringValue("Arrange Hours")
	String arrangeHours();

	@DefaultStringArrayValue({
		"blue", "green", "orange", "yellow", "pink",
		"purple", "teal", "darkpurple", "steelblue", "lightblue",
		"lightgreen", "yellowgreen", "redorange", "lightbrown", "lightpurple",
		"grey", "bluegrey", "lightteal", "yellowgrey", "brown", "red"})
	@DoNotTranslate
	String[] meetingColors();
	
	@DefaultStringArrayValue({
		"Room Timetable", "Subject Timetable", "Curriculum Timetable", "Departmental Timetable", "Personal Timetable", "Course Timetable", "Student Group Timetable"
	})
	String[] resourceType();

	@DefaultStringArrayValue({
		"Room", "Subject", "Curriculum", "Department", "Person", "Course", "Student Group"
	})
	String[] resourceName();
	
	@DefaultStringArrayValue({
		"Class Event", "Final Examination Event", "Midterm Examination Event", "Course Related Event", "Special Event", "Not Available", "Message"
	})
	String[] eventTypeName();
	
	@DefaultStringArrayValue({
		"Class", "Final Examination", "Midterm Examination", "Course", "Special", "Not Available", "Message"
	})
	String[] eventTypeAbbv();
	
	@DefaultStringArrayValue({
		"Class", "Final", "Midterm", "Course", "Special", "N/A", "Message"
	})
	String[] eventTypeShort();
	
	@DefaultStringArrayValue({
		"Pending", "Approved", "Rejected", "Cancelled"
	})
	String[] eventApprovalStatus();

	// firstDay|lastDay|firstSlot|lastSlot|step
	@DefaultStringArrayValue({
			"Workdays \u00d7 Daytime|0|4|90|222|6",
			"All Week \u00d7 Daytime|0|6|90|222|6",
			"Workdays \u00d7 Evening|0|4|222|288|6",
			"All Week \u00d7 Evening|0|5|222|288|6",
			"All Week \u00d7 All Times|0|6|0|288|6"
	})
	String[] roomSharingModes();
	
	@DefaultStringValue("MMMM d")
	String weekSelectionDateFormat();
	
	@DefaultStringValue("EEEE MMMM d")
	String dateSelectionDateFormat();
	
	@DefaultStringValue("EEEE MMMM d yyyy")
	String singleDateSelectionFormat();
	
	@DefaultStringValue("M/d")
	String dateFormatShort();
	
	@DefaultStringValue("h:mma")
	String timeFormatShort();
	
	@DefaultStringValue("MMM d, yyyy")
	String sessionDateFormat();
	
	@DefaultStringValue("MM/dd/yyyy")
	String dateEntryFormat();
	
	@DefaultStringArrayValue({
		"Override: Allow Time Conflict", "Override: Can Assign Over Limit", "Override: Time Conflict & Over Limit"
	})
	String[] reservationOverrideTypeName();
	
	@DefaultStringArrayValue({
		"Time Conflict", "Over Limit", "Time & Limit"
	})
	String[] reservationOverrideTypeAbbv();

	@DefaultBooleanValue(false)
	@DoNotTranslate
	boolean displayMidtermPeriodPreferencesAsCalendar();
	
	@DefaultStringArrayValue({
		"No Event Management",
		"Authenticated Users Can Request Events Managers Can Approve",
		"Departmental Users Can Request Events Managers Can Approve",
		"Event Managers Can Request Or Approve Events",
		"Authenticated Users Can Request Events No Approval",
		"Departmental Users Can Request Events No Approval",
		"Event Managers Can Request Events No Approval",
	})
	String[] eventStatusName();
	
	@DefaultStringArrayValue({
		"Disabled",
		"Enabled",
		"Only Department",
		"Only Managers",
		"Enabled<br>No Approval",
		"Only Department<br>No Approval",
		"Only Managers<br>No Approval",
	})
	String[] eventStatusAbbv();
	
	@DefaultStringValue("#,##0.##")
	String roomAreaFormat();
	
	@DefaultStringValue("#0.0###")
	String roomCoordinateFormat();
	
	@DefaultStringValue("square feet")
	String roomAreaUnitsLong();

	@DefaultStringValue("ft&sup2;")
	String roomAreaUnitsShort();
	
	@DefaultStringValue("ft2")
	String roomAreaUnitsShortPlainText();
	
	@DefaultStringValue("square meters")
	String roomAreaMetricUnitsLong();

	@DefaultStringValue("m&sup2;")
	String roomAreaMetricUnitsShort();
	
	@DefaultStringValue("m2")
	String roomAreaMetricUnitsShortPlainText();

	@DefaultBooleanValue(false)
	@DoNotTranslate
	boolean timeGridStudentGroupDoesNotOverlap();
	
	@DefaultBooleanValue(false)
	@DoNotTranslate
	boolean searchWhenPageIsLoaded();
	
	@DoNotTranslate
	@DefaultStringValue("MM/dd/yyyy")
	String filterDateFormat();
	
	@DefaultStringArrayValue({
		"All",
		"My",
		"Approved",
		"Unapproved",
		"Awaiting",
		"Conflicting",
		"My Awaiting",
		"Cancelled",
		"Expiring",
	})
	String[] eventModeAbbv();
	
	@DefaultStringArrayValue({
		"All Events",
		"My Events",
		"Approved Events",
		"Not Approved Events",
		"Awaiting Events",
		"Conflicting Events",
		"Awaiting My Approval",
		"Cancelled / Rejected",
		"Expiring Events",
	})
	String[] eventModeLabel();
	
	@DefaultStringArrayValue({
		"All",
		"Student",
		"Instructor",
		"Coordinator",
		"Contact",
	})
	String[] eventRole();
	
	@DefaultStringArrayValue({
		"All",
		"Expired",
		"Not Expired",
	})
	String[] reservationModeAbbv();
	
	
	@DefaultStringArrayValue({
		"All Reservations",
		"Expired",
		"Not Expired",
		
	})
	String[] reservationModeLabel();
	
	@DefaultBooleanValue(false)
	@DoNotTranslate
	boolean checkRoomHasNoDepartment();
}
