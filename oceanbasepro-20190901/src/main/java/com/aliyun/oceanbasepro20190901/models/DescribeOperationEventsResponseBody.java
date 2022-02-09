// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOperationEventsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOperationEventsResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOperationEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationEventsResponseBody self = new DescribeOperationEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperationEventsResponseBody setData(java.util.List<DescribeOperationEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOperationEventsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOperationEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperationEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOperationEventsResponseBodyData extends TeaModel {
        @NameInMap("CallerUid")
        public String callerUid;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EventDescription")
        public String eventDescription;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("EventStatus")
        public String eventStatus;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Params")
        public String params;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("Uid")
        public String uid;

        public static DescribeOperationEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperationEventsResponseBodyData self = new DescribeOperationEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOperationEventsResponseBodyData setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public DescribeOperationEventsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOperationEventsResponseBodyData setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }
        public String getEventDescription() {
            return this.eventDescription;
        }

        public DescribeOperationEventsResponseBodyData setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeOperationEventsResponseBodyData setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeOperationEventsResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeOperationEventsResponseBodyData setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeOperationEventsResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeOperationEventsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeOperationEventsResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeOperationEventsResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeOperationEventsResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOperationEventsResponseBodyData setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeOperationEventsResponseBodyData setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeOperationEventsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
