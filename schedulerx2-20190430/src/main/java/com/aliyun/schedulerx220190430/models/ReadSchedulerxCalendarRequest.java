// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxCalendarRequest extends TeaModel {
    /**
     * <p>The calendar name.</p>
     * 
     * <strong>example:</strong>
     * <p>2025workday</p>
     */
    @NameInMap("CalendarName")
    public String calendarName;

    /**
     * <p>Specifies whether to retrieve calendar details. The default value is false.</p>
     * <ul>
     * <li>false: Returns only basic information without the detailed list of days for each month.</li>
     * <li>true: Returns the detailed list of days for each month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchCalendarDetail")
    public Boolean fetchCalendarDetail;

    /**
     * <p>Specifies whether to retrieve system calendars. The default value is false.</p>
     * <ul>
     * <li>false: Returns only user-defined calendars.</li>
     * <li>true: Returns both system calendars and user-defined calendars.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchSystemCalendar")
    public Boolean fetchSystemCalendar;

    /**
     * <p>The maximum number of entries to return on this call. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A token that specifies the starting position for retrieving the next page of data. You do not need to provide this parameter for the first request. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdYzT97YjSXWT8TQmxIAI5g=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The year.</p>
     * 
     * <strong>example:</strong>
     * <p>2025</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static ReadSchedulerxCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxCalendarRequest self = new ReadSchedulerxCalendarRequest();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxCalendarRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public ReadSchedulerxCalendarRequest setFetchCalendarDetail(Boolean fetchCalendarDetail) {
        this.fetchCalendarDetail = fetchCalendarDetail;
        return this;
    }
    public Boolean getFetchCalendarDetail() {
        return this.fetchCalendarDetail;
    }

    public ReadSchedulerxCalendarRequest setFetchSystemCalendar(Boolean fetchSystemCalendar) {
        this.fetchSystemCalendar = fetchSystemCalendar;
        return this;
    }
    public Boolean getFetchSystemCalendar() {
        return this.fetchSystemCalendar;
    }

    public ReadSchedulerxCalendarRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ReadSchedulerxCalendarRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ReadSchedulerxCalendarRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReadSchedulerxCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
