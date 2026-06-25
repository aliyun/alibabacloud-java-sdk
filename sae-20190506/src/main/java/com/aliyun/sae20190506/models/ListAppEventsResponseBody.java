// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Client error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The event list.</p>
     */
    @NameInMap("Data")
    public ListAppEventsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error Codes</strong> section.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsResponseBody self = new ListAppEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppEventsResponseBody setData(ListAppEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppEventsResponseBodyData getData() {
        return this.data;
    }

    public ListAppEventsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppEventsResponseBodyDataAppEventEntity extends TeaModel {
        /**
         * <p>The cause analysis.</p>
         */
        @NameInMap("CauseAnalysis")
        public String causeAnalysis;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The timestamp of the event\&quot;s first occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-19T05:01:28Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The timestamp of the event\&quot;s last occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-19T05:01:28Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The event message.</p>
         * 
         * <strong>example:</strong>
         * <p>Created container</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The object kind.</p>
         * 
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        @NameInMap("ObjectKind")
        public String objectKind;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>errew-b86bf540-b4dc-47d8-a42f-b4997c14bd8f-5595cbddd6-2****</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The reason for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ListAppEventsResponseBodyDataAppEventEntity build(java.util.Map<String, ?> map) throws Exception {
            ListAppEventsResponseBodyDataAppEventEntity self = new ListAppEventsResponseBodyDataAppEventEntity();
            return TeaModel.build(map, self);
        }

        public ListAppEventsResponseBodyDataAppEventEntity setCauseAnalysis(String causeAnalysis) {
            this.causeAnalysis = causeAnalysis;
            return this;
        }
        public String getCauseAnalysis() {
            return this.causeAnalysis;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setObjectKind(String objectKind) {
            this.objectKind = objectKind;
            return this;
        }
        public String getObjectKind() {
            return this.objectKind;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListAppEventsResponseBodyData extends TeaModel {
        /**
         * <p>An array of application events.</p>
         */
        @NameInMap("AppEventEntity")
        public java.util.List<ListAppEventsResponseBodyDataAppEventEntity> appEventEntity;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count of application events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppEventsResponseBodyData self = new ListAppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppEventsResponseBodyData setAppEventEntity(java.util.List<ListAppEventsResponseBodyDataAppEventEntity> appEventEntity) {
            this.appEventEntity = appEventEntity;
            return this;
        }
        public java.util.List<ListAppEventsResponseBodyDataAppEventEntity> getAppEventEntity() {
            return this.appEventEntity;
        }

        public ListAppEventsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAppEventsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppEventsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
