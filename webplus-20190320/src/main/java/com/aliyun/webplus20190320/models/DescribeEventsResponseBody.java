// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Events")
    public DescribeEventsResponseBodyEvents events;

    @NameInMap("Code")
    public String code;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponseBody setEvents(DescribeEventsResponseBodyEvents events) {
        this.events = events;
        return this;
    }
    public DescribeEventsResponseBodyEvents getEvents() {
        return this.events;
    }

    public DescribeEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        public static DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr self = new DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class DescribeEventsResponseBodyEventsEventObjectAttrs extends TeaModel {
        @NameInMap("ObjectAttr")
        public java.util.List<DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr> objectAttr;

        public static DescribeEventsResponseBodyEventsEventObjectAttrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventsEventObjectAttrs self = new DescribeEventsResponseBodyEventsEventObjectAttrs();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventsEventObjectAttrs setObjectAttr(java.util.List<DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr> objectAttr) {
            this.objectAttr = objectAttr;
            return this;
        }
        public java.util.List<DescribeEventsResponseBodyEventsEventObjectAttrsObjectAttr> getObjectAttr() {
            return this.objectAttr;
        }

    }

    public static class DescribeEventsResponseBodyEventsEventMsgParams extends TeaModel {
        @NameInMap("MsgParam")
        public java.util.List<String> msgParam;

        public static DescribeEventsResponseBodyEventsEventMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventsEventMsgParams self = new DescribeEventsResponseBodyEventsEventMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventsEventMsgParams setMsgParam(java.util.List<String> msgParam) {
            this.msgParam = msgParam;
            return this;
        }
        public java.util.List<String> getMsgParam() {
            return this.msgParam;
        }

    }

    public static class DescribeEventsResponseBodyEventsEvent extends TeaModel {
        @NameInMap("PrimaryUserName")
        public String primaryUserName;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("EnventName")
        public String enventName;

        @NameInMap("EventTimestamp")
        public Long eventTimestamp;

        @NameInMap("SecondUserName")
        public String secondUserName;

        @NameInMap("MsgCode")
        public String msgCode;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("EventMessage")
        public String eventMessage;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("ObjectAttrs")
        public DescribeEventsResponseBodyEventsEventObjectAttrs objectAttrs;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("MsgParams")
        public DescribeEventsResponseBodyEventsEventMsgParams msgParams;

        @NameInMap("PrimaryUserId")
        public String primaryUserId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("SecondUserId")
        public String secondUserId;

        public static DescribeEventsResponseBodyEventsEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventsEvent self = new DescribeEventsResponseBodyEventsEvent();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventsEvent setPrimaryUserName(String primaryUserName) {
            this.primaryUserName = primaryUserName;
            return this;
        }
        public String getPrimaryUserName() {
            return this.primaryUserName;
        }

        public DescribeEventsResponseBodyEventsEvent setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeEventsResponseBodyEventsEvent setEnventName(String enventName) {
            this.enventName = enventName;
            return this;
        }
        public String getEnventName() {
            return this.enventName;
        }

        public DescribeEventsResponseBodyEventsEvent setEventTimestamp(Long eventTimestamp) {
            this.eventTimestamp = eventTimestamp;
            return this;
        }
        public Long getEventTimestamp() {
            return this.eventTimestamp;
        }

        public DescribeEventsResponseBodyEventsEvent setSecondUserName(String secondUserName) {
            this.secondUserName = secondUserName;
            return this;
        }
        public String getSecondUserName() {
            return this.secondUserName;
        }

        public DescribeEventsResponseBodyEventsEvent setMsgCode(String msgCode) {
            this.msgCode = msgCode;
            return this;
        }
        public String getMsgCode() {
            return this.msgCode;
        }

        public DescribeEventsResponseBodyEventsEvent setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeEventsResponseBodyEventsEvent setEventMessage(String eventMessage) {
            this.eventMessage = eventMessage;
            return this;
        }
        public String getEventMessage() {
            return this.eventMessage;
        }

        public DescribeEventsResponseBodyEventsEvent setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEventsEvent setObjectAttrs(DescribeEventsResponseBodyEventsEventObjectAttrs objectAttrs) {
            this.objectAttrs = objectAttrs;
            return this;
        }
        public DescribeEventsResponseBodyEventsEventObjectAttrs getObjectAttrs() {
            return this.objectAttrs;
        }

        public DescribeEventsResponseBodyEventsEvent setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeEventsResponseBodyEventsEvent setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeEventsResponseBodyEventsEvent setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public DescribeEventsResponseBodyEventsEvent setMsgParams(DescribeEventsResponseBodyEventsEventMsgParams msgParams) {
            this.msgParams = msgParams;
            return this;
        }
        public DescribeEventsResponseBodyEventsEventMsgParams getMsgParams() {
            return this.msgParams;
        }

        public DescribeEventsResponseBodyEventsEvent setPrimaryUserId(String primaryUserId) {
            this.primaryUserId = primaryUserId;
            return this;
        }
        public String getPrimaryUserId() {
            return this.primaryUserId;
        }

        public DescribeEventsResponseBodyEventsEvent setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeEventsResponseBodyEventsEvent setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeEventsResponseBodyEventsEvent setSecondUserId(String secondUserId) {
            this.secondUserId = secondUserId;
            return this;
        }
        public String getSecondUserId() {
            return this.secondUserId;
        }

    }

    public static class DescribeEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Event")
        public java.util.List<DescribeEventsResponseBodyEventsEvent> event;

        public static DescribeEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEvents self = new DescribeEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEvents setEvent(java.util.List<DescribeEventsResponseBodyEventsEvent> event) {
            this.event = event;
            return this;
        }
        public java.util.List<DescribeEventsResponseBodyEventsEvent> getEvent() {
            return this.event;
        }

    }

}
