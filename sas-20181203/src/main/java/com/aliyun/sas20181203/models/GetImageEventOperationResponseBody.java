// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageEventOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetImageEventOperationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetImageEventOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageEventOperationResponseBody self = new GetImageEventOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageEventOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageEventOperationResponseBody setData(GetImageEventOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageEventOperationResponseBodyData getData() {
        return this.data;
    }

    public GetImageEventOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageEventOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageEventOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageEventOperationResponseBodyData extends TeaModel {
        @NameInMap("Conditions")
        public String conditions;

        @NameInMap("EventKey")
        public String eventKey;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OperationCode")
        public String operationCode;

        @NameInMap("Scenarios")
        public String scenarios;

        public static GetImageEventOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageEventOperationResponseBodyData self = new GetImageEventOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageEventOperationResponseBodyData setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public GetImageEventOperationResponseBodyData setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public GetImageEventOperationResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetImageEventOperationResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetImageEventOperationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetImageEventOperationResponseBodyData setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public GetImageEventOperationResponseBodyData setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

}
