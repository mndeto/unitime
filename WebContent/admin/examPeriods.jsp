<%-- 
 * UniTime 3.0 (University Course Timetabling & Student Sectioning Application)
 * Copyright (C) 2007, UniTime.org
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 --%>
<%@ page language="java" autoFlush="true"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/timetable.tld" prefix="tt" %>
<tiles:importAttribute />

<html:form action="/examPeriodEdit">

<logic:notEqual name="examPeriodEditForm" property="op" value="List">
	<html:hidden property="uniqueId"/><html:errors property="uniqueId"/>
	<TABLE width="90%" border="0" cellspacing="0" cellpadding="3">
		<TR>
			<TD colspan="2">
				<tt:section-header>
					<tt:section-title>
						<logic:equal name="examPeriodEditForm" property="op" value="Save">
							Add
						</logic:equal>
						<logic:notEqual name="examPeriodEditForm" property="op" value="Save">
							Edit
						</logic:notEqual>
						Date Pattern
					</tt:section-title>
					<html:submit property="op">
						<bean:write name="examPeriodEditForm" property="op" />
					</html:submit> 
					<logic:notEqual name="examPeriodEditForm" property="op" value="Save">
						<html:submit property="op" value="Delete"/> 
					</logic:notEqual>
					<html:submit property="op" value="Back" /> 
				</tt:section-header>
			</TD>
		</TR>

		<TR>
			<TD>Date:</TD>
			<TD>
				<html:text property="date" size="10" maxlength="10" styleId="date"/>
				<img style="cursor: pointer;" src="scripts/jscalendar/calendar_1.gif" border="0" id="show_date">
				&nbsp;<html:errors property="date"/>
			</TD>
		</TR>

		<TR>
			<TD>Start Time:</TD>
			<TD>
			<html:text property="start" size="4" maxlength="4"/> (in military format)
			&nbsp;<html:errors property="start"/>
			</TD>
		</TR>

		<TR>
			<TD>Length:</TD>
			<TD>
			<html:text property="length" size="4" maxlength="4"/> (in minutes)
			&nbsp;<html:errors property="length"/>
			</TD>
		</TR>

		<TR>
			<TD align="right" colspan="2">
				<tt:section-title/>
			</TD>
		</TR>
		
		<TR>
			<TD align="right" colspan="2">
				<html:submit property="op">
					<bean:write name="examPeriodEditForm" property="op" />
				</html:submit> 
				<logic:notEqual name="examPeriodEditForm" property="op" value="Save">
					<html:submit property="op" value="Delete"/> 
				</logic:notEqual>
				<html:submit property="op" value="Back" /> 
			</TD>
		</TR>
	</TABLE>

<BR>
<script type="text/javascript" language="javascript">
	
	Calendar.setup( {
		cache      : true, 					// Single object used for all calendars
		electric   : false, 				// Changes date only when calendar is closed
		inputField : "date",		// ID of the input field
	    ifFormat   : "%m/%d/%Y", 			// Format of the input field
	    showOthers : true,					// Show overlap of dates from other months	    
	    <% if (request.getParameter("date")!=null && request.getParameter("date").length()>=10) { %>
	    date		: <%=request.getParameter("date")%>,
	    <% }%>
		button     : "show_date"	// ID of the button
	} );

</script>
</logic:notEqual>
<logic:equal name="examPeriodEditForm" property="op" value="List">
<TABLE width="90%" border="0" cellspacing="0" cellpadding="3">
	<TR>
		<TD colspan='5'>
			<tt:section-header>
				<tt:section-title>Examination Periods</tt:section-title>
				<html:submit property="op" value="Add Period" title="Create a new examination period"/>
			</tt:section-header>
		</TD>
	</TR>
	<%= request.getAttribute("ExamPeriods.table") %>
	<TR>
		<TD colspan='5'>
			<tt:section-title/>
		</TD>
	</TR>
	<TR>
		<TD colspan='5' align="right">
			<html:submit property="op" value="Add Period" title="Create a new examination period"/>
		</TD>
	</TR>
	<% if (request.getAttribute("hash") != null) { %>
		<SCRIPT type="text/javascript" language="javascript">
			location.hash = '<%=request.getAttribute("hash")%>';
		</SCRIPT>
	<% } %>
</TABLE>
</logic:equal>

</html:form>
