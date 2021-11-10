// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDefaultEventResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateDefaultEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventResponseBody self = new CreateDefaultEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventResponseBody setData(CreateDefaultEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDefaultEventResponseBodyData getData() {
        return this.data;
    }

    public CreateDefaultEventResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDefaultEventResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CreateDefaultEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDefaultEventResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateDefaultEventResponseBodyDataEventAttributeList extends TeaModel {
        @NameInMap("EventAttributeCode")
        public String eventAttributeCode;

        @NameInMap("EventAttributeName")
        public String eventAttributeName;

        @NameInMap("EventAttributeTypeCode")
        public Long eventAttributeTypeCode;

        @NameInMap("EventId")
        public String eventId;

        public static CreateDefaultEventResponseBodyDataEventAttributeList build(java.util.Map<String, ?> map) throws Exception {
            CreateDefaultEventResponseBodyDataEventAttributeList self = new CreateDefaultEventResponseBodyDataEventAttributeList();
            return TeaModel.build(map, self);
        }

        public CreateDefaultEventResponseBodyDataEventAttributeList setEventAttributeCode(String eventAttributeCode) {
            this.eventAttributeCode = eventAttributeCode;
            return this;
        }
        public String getEventAttributeCode() {
            return this.eventAttributeCode;
        }

        public CreateDefaultEventResponseBodyDataEventAttributeList setEventAttributeName(String eventAttributeName) {
            this.eventAttributeName = eventAttributeName;
            return this;
        }
        public String getEventAttributeName() {
            return this.eventAttributeName;
        }

        public CreateDefaultEventResponseBodyDataEventAttributeList setEventAttributeTypeCode(Long eventAttributeTypeCode) {
            this.eventAttributeTypeCode = eventAttributeTypeCode;
            return this;
        }
        public Long getEventAttributeTypeCode() {
            return this.eventAttributeTypeCode;
        }

        public CreateDefaultEventResponseBodyDataEventAttributeList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

    }

    public static class CreateDefaultEventResponseBodyData extends TeaModel {
        @NameInMap("CreateId")
        public String createId;

        @NameInMap("EventAttributeList")
        public java.util.List<CreateDefaultEventResponseBodyDataEventAttributeList> eventAttributeList;

        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventSourceId")
        public String eventSourceId;

        @NameInMap("EventSourceName")
        public String eventSourceName;

        @NameInMap("EventType")
        public Long eventType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ModifiedId")
        public String modifiedId;

        @NameInMap("OrgnizationId")
        public String orgnizationId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateDefaultEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDefaultEventResponseBodyData self = new CreateDefaultEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDefaultEventResponseBodyData setCreateId(String createId) {
            this.createId = createId;
            return this;
        }
        public String getCreateId() {
            return this.createId;
        }

        public CreateDefaultEventResponseBodyData setEventAttributeList(java.util.List<CreateDefaultEventResponseBodyDataEventAttributeList> eventAttributeList) {
            this.eventAttributeList = eventAttributeList;
            return this;
        }
        public java.util.List<CreateDefaultEventResponseBodyDataEventAttributeList> getEventAttributeList() {
            return this.eventAttributeList;
        }

        public CreateDefaultEventResponseBodyData setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public CreateDefaultEventResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public CreateDefaultEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public CreateDefaultEventResponseBodyData setEventSourceId(String eventSourceId) {
            this.eventSourceId = eventSourceId;
            return this;
        }
        public String getEventSourceId() {
            return this.eventSourceId;
        }

        public CreateDefaultEventResponseBodyData setEventSourceName(String eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }
        public String getEventSourceName() {
            return this.eventSourceName;
        }

        public CreateDefaultEventResponseBodyData setEventType(Long eventType) {
            this.eventType = eventType;
            return this;
        }
        public Long getEventType() {
            return this.eventType;
        }

        public CreateDefaultEventResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDefaultEventResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateDefaultEventResponseBodyData setModifiedId(String modifiedId) {
            this.modifiedId = modifiedId;
            return this;
        }
        public String getModifiedId() {
            return this.modifiedId;
        }

        public CreateDefaultEventResponseBodyData setOrgnizationId(String orgnizationId) {
            this.orgnizationId = orgnizationId;
            return this;
        }
        public String getOrgnizationId() {
            return this.orgnizationId;
        }

        public CreateDefaultEventResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
