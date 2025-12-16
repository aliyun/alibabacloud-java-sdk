// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxCalendarResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ReadSchedulerxCalendarResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>unknown exception occurred</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8E5FB4A-6D8D-424D-9AAA-4FE06BB74FF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadSchedulerxCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxCalendarResponseBody self = new ReadSchedulerxCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxCalendarResponseBody setAccessDeniedDetail(ReadSchedulerxCalendarResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReadSchedulerxCalendarResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReadSchedulerxCalendarResponseBody setData(ReadSchedulerxCalendarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadSchedulerxCalendarResponseBodyData getData() {
        return this.data;
    }

    public ReadSchedulerxCalendarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadSchedulerxCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadSchedulerxCalendarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadSchedulerxCalendarResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>edas:ReadSchedulerxCalendar</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The principal name.</p>
         * 
         * <strong>example:</strong>
         * <p>209312833131416xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The account of the principal.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800526xxx</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaDEssEE4MDg4NTQyLTVGMTYtNTFEQy1CODJCLUFFMDY4NUVDQ0ZBQQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The permission denial type.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ReadSchedulerxCalendarResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxCalendarResponseBodyAccessDeniedDetail self = new ReadSchedulerxCalendarResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ReadSchedulerxCalendarResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ReadSchedulerxCalendarResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The calendar name.</p>
         * 
         * <strong>example:</strong>
         * <p>2025workday</p>
         */
        @NameInMap("CalendarName")
        public String calendarName;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800526xxx</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The months and days.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},
         *   {&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},
         *   {&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
         *   {&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},
         *   {&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},
         *   {&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},
         *   {&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
         *   {&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
         *   {&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},
         *   {&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},
         *   {&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},
         *   {&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}
         * ]</p>
         */
        @NameInMap("MonthDaysContent")
        public String monthDaysContent;

        /**
         * <p>Indicates whether it is a system calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemCalendar")
        public Boolean systemCalendar;

        /**
         * <p>The year.</p>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static ReadSchedulerxCalendarResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxCalendarResponseBodyDataRecords self = new ReadSchedulerxCalendarResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxCalendarResponseBodyDataRecords setCalendarName(String calendarName) {
            this.calendarName = calendarName;
            return this;
        }
        public String getCalendarName() {
            return this.calendarName;
        }

        public ReadSchedulerxCalendarResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ReadSchedulerxCalendarResponseBodyDataRecords setMonthDaysContent(String monthDaysContent) {
            this.monthDaysContent = monthDaysContent;
            return this;
        }
        public String getMonthDaysContent() {
            return this.monthDaysContent;
        }

        public ReadSchedulerxCalendarResponseBodyDataRecords setSystemCalendar(Boolean systemCalendar) {
            this.systemCalendar = systemCalendar;
            return this;
        }
        public Boolean getSystemCalendar() {
            return this.systemCalendar;
        }

        public ReadSchedulerxCalendarResponseBodyDataRecords setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class ReadSchedulerxCalendarResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>When there is more data to retrieve, the server returns a nextToken. You can use this token in a subsequent request to continue reading from where you left off.</p>
         * 
         * <strong>example:</strong>
         * <p>O39nXKu5XafATl3/cJjSJw==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ReadSchedulerxCalendarResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ReadSchedulerxCalendarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxCalendarResponseBodyData self = new ReadSchedulerxCalendarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxCalendarResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ReadSchedulerxCalendarResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadSchedulerxCalendarResponseBodyData setRecords(java.util.List<ReadSchedulerxCalendarResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ReadSchedulerxCalendarResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ReadSchedulerxCalendarResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
