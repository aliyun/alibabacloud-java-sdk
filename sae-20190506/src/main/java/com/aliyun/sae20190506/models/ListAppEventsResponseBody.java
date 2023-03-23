// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of events.</p>
     */
    @NameInMap("Data")
    public ListAppEventsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the events that occurred in an application were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the events were obtained.</p>
     * <p>*   **false**: indicates that the events could not be obtained.</p>
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
         * <p>The type of the event.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The timestamp of the first occurrence of an event.</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The timestamp of the last occurrence of an event.</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The type of the object.</p>
         */
        @NameInMap("ObjectKind")
        public String objectKind;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The reason why the event occurred.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ListAppEventsResponseBodyDataAppEventEntity build(java.util.Map<String, ?> map) throws Exception {
            ListAppEventsResponseBodyDataAppEventEntity self = new ListAppEventsResponseBodyDataAppEventEntity();
            return TeaModel.build(map, self);
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
         * <p>The list of events.</p>
         */
        @NameInMap("AppEventEntity")
        public java.util.List<ListAppEventsResponseBodyDataAppEventEntity> appEventEntity;

        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of events that occurred in the application.</p>
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
