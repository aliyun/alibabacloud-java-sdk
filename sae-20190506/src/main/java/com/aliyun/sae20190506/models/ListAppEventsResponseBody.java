// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Data")
    @Validation(required = true)
    public ListAppEventsResponseBodyData data;

    public static ListAppEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsResponseBody self = new ListAppEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppEventsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppEventsResponseBody setData(ListAppEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppEventsResponseBodyData getData() {
        return this.data;
    }

    public static class ListAppEventsResponseBodyDataAppEventEntity extends TeaModel {
        @NameInMap("ObjectKind")
        @Validation(required = true)
        public String objectKind;

        @NameInMap("ObjectName")
        @Validation(required = true)
        public String objectName;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("FirstTimestamp")
        @Validation(required = true)
        public String firstTimestamp;

        @NameInMap("LastTimestamp")
        @Validation(required = true)
        public String lastTimestamp;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        public static ListAppEventsResponseBodyDataAppEventEntity build(java.util.Map<String, ?> map) throws Exception {
            ListAppEventsResponseBodyDataAppEventEntity self = new ListAppEventsResponseBodyDataAppEventEntity();
            return TeaModel.build(map, self);
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

        public ListAppEventsResponseBodyDataAppEventEntity setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListAppEventsResponseBodyDataAppEventEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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

        public ListAppEventsResponseBodyDataAppEventEntity setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListAppEventsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("AppEventEntity")
        @Validation(required = true)
        public java.util.List<ListAppEventsResponseBodyDataAppEventEntity> appEventEntity;

        public static ListAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppEventsResponseBodyData self = new ListAppEventsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListAppEventsResponseBodyData setAppEventEntity(java.util.List<ListAppEventsResponseBodyDataAppEventEntity> appEventEntity) {
            this.appEventEntity = appEventEntity;
            return this;
        }
        public java.util.List<ListAppEventsResponseBodyDataAppEventEntity> getAppEventEntity() {
            return this.appEventEntity;
        }

    }

}
