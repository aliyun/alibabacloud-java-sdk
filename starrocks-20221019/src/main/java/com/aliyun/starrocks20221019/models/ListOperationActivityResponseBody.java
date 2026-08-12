// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationActivityResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOperationActivityResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>440</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOperationActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationActivityResponseBody self = new ListOperationActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationActivityResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListOperationActivityResponseBody setData(java.util.List<ListOperationActivityResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationActivityResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationActivityResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListOperationActivityResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListOperationActivityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOperationActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationActivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOperationActivityResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOperationActivityResponseBodyData extends TeaModel {
        /**
         * <p>The activity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-8f3f7c4026e3****</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <p>The activity status. Valid values:</p>
         * <ul>
         * <li>COMPLETED</li>
         * <li>RUNNING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("ActivityStatus")
        public String activityStatus;

        @NameInMap("ConsoleRetryCount")
        public Integer consoleRetryCount;

        /**
         * <p>The end time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>1742178604000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The activity name.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateClusterStatusToModifyingConfigStatus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The start time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>1742178604000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListOperationActivityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationActivityResponseBodyData self = new ListOperationActivityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationActivityResponseBodyData setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ListOperationActivityResponseBodyData setActivityStatus(String activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }
        public String getActivityStatus() {
            return this.activityStatus;
        }

        public ListOperationActivityResponseBodyData setConsoleRetryCount(Integer consoleRetryCount) {
            this.consoleRetryCount = consoleRetryCount;
            return this;
        }
        public Integer getConsoleRetryCount() {
            return this.consoleRetryCount;
        }

        public ListOperationActivityResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOperationActivityResponseBodyData setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ListOperationActivityResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOperationActivityResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
