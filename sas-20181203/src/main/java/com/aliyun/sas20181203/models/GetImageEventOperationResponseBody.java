// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageEventOperationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetImageEventOperationResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
         * <br>
         * <p>*   **condition**: the matching condition.</p>
         * <p>*   **type**: the matching type.</p>
         * <p>*   **value**: the matching value.</p>
         */
        @NameInMap("Conditions")
        public String conditions;

        /**
         * <p>The keyword of the alert item.</p>
         */
        @NameInMap("EventKey")
        public String eventKey;

        /**
         * <p>The name of the alert item.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The alert type. Valid values:</p>
         * <br>
         * <p>*   **sensitiveFile**</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The primary key of the alert handling rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation code. Valid values:</p>
         * <br>
         * <p>*   **whitelist**: added to the whitelist.</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
         * <br>
         * <p>*   **type**</p>
         * <p>*   **value**</p>
         */
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
