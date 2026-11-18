// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListCalendarsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The calendar list and pagination information.</p>
     */
    @NameInMap("Data")
    public ListCalendarsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCalendarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsResponseBody self = new ListCalendarsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalendarsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCalendarsResponseBody setData(ListCalendarsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCalendarsResponseBodyData getData() {
        return this.data;
    }

    public ListCalendarsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCalendarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalendarsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCalendarsResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The calendar name.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("CalendarName")
        public String calendarName;

        /**
         * <p>The calendar for each month in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {&quot;month&quot;:1,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
         *   {&quot;month&quot;:2,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
         *   {&quot;month&quot;:3,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
         *   {&quot;month&quot;:4,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30]},
         *   {&quot;month&quot;:5,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,22,23,26,27,28,29,30]},
         *   {&quot;month&quot;:6,&quot;days&quot;:[2,3,4,5,6,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30]},
         *   {&quot;month&quot;:7,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
         *   {&quot;month&quot;:8,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]},
         *   {&quot;month&quot;:9,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30]},
         *   {&quot;month&quot;:10,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
         *   {&quot;month&quot;:11,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
         *   {&quot;month&quot;:12,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]}
         * ]</p>
         */
        @NameInMap("Months")
        public String months;

        /**
         * <p>The year.</p>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static ListCalendarsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyDataRecords self = new ListCalendarsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyDataRecords setCalendarName(String calendarName) {
            this.calendarName = calendarName;
            return this;
        }
        public String getCalendarName() {
            return this.calendarName;
        }

        public ListCalendarsResponseBodyDataRecords setMonths(String months) {
            this.months = months;
            return this;
        }
        public String getMonths() {
            return this.months;
        }

        public ListCalendarsResponseBodyDataRecords setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class ListCalendarsResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries to return for the current request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is returned by the server when the data that meets the query conditions is not completely read. You can use this token to continue reading the remaining data. You do not need to specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of records.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListCalendarsResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListCalendarsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyData self = new ListCalendarsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListCalendarsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListCalendarsResponseBodyData setRecords(java.util.List<ListCalendarsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCalendarsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListCalendarsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
