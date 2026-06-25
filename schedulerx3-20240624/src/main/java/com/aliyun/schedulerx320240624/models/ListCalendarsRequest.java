// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListCalendarsRequest extends TeaModel {
    /**
     * <p>The name of the calendar.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("CalendarName")
    public String calendarName;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to return calendar details. The default value is <code>false</code>.</p>
     * <ul>
     * <li><p><code>false</code>: Does not return the detailed list of days for each month. Only basic information is returned.</p>
     * </li>
     * <li><p><code>true</code>: Returns the detailed list of days for each month.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchCalendarDetail")
    public Boolean fetchCalendarDetail;

    /**
     * <p>The maximum number of entries returned per page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. Set this parameter to the <code>NextToken</code> value from the previous response. Omit this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The year.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static ListCalendarsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsRequest self = new ListCalendarsRequest();
        return TeaModel.build(map, self);
    }

    public ListCalendarsRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public ListCalendarsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCalendarsRequest setFetchCalendarDetail(Boolean fetchCalendarDetail) {
        this.fetchCalendarDetail = fetchCalendarDetail;
        return this;
    }
    public Boolean getFetchCalendarDetail() {
        return this.fetchCalendarDetail;
    }

    public ListCalendarsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCalendarsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCalendarsRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
