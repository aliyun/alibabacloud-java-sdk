// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AddImageEventOperationResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The API call succeeded.</li>
     * <li><strong>false</strong>: The API call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddImageEventOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageEventOperationResponseBody self = new AddImageEventOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageEventOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddImageEventOperationResponseBody setData(AddImageEventOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddImageEventOperationResponseBodyData getData() {
        return this.data;
    }

    public AddImageEventOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddImageEventOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageEventOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddImageEventOperationResponseBodyData extends TeaModel {
        /**
         * <p>The rule conditions. The value is in JSON format. Valid keys:</p>
         * <ul>
         * <li><strong>condition</strong>: The matching condition.</li>
         * <li><strong>type</strong>: The matching type.</li>
         * <li><strong>value</strong>: The matching value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;condition\&quot;: \&quot;MD5\&quot;, \&quot;type\&quot;: \&quot;equals\&quot;, \&quot;value\&quot;: \&quot;0083a31cc0083a31ccf7c10367a6e783e\&quot;}]</p>
         */
        @NameInMap("Conditions")
        public String conditions;

        /**
         * <p>The alert metric keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>PEM</p>
         */
        @NameInMap("EventKey")
        public String eventKey;

        /**
         * <p>The alert metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>PEM</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The Alarm Metric for alerting. Valid values:</p>
         * <ul>
         * <li><strong>sensitiveFile</strong>: Sensitive file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sensitiveFile</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The primary key of the alert handling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>443496</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation code. Valid values:</p>
         * <ul>
         * <li><strong>whitelist</strong>: Whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The rule scope. The value is in JSON format. Valid keys:</p>
         * <ul>
         * <li><strong>type</strong>: The scope type.</li>
         * <li><strong>value</strong>: The scope value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;: \&quot;repo\&quot;, \&quot;value\&quot;: \&quot;test-aaa/shenzhen-repo-01\&quot;}</p>
         */
        @NameInMap("Scenarios")
        public String scenarios;

        public static AddImageEventOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddImageEventOperationResponseBodyData self = new AddImageEventOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddImageEventOperationResponseBodyData setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public AddImageEventOperationResponseBodyData setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public AddImageEventOperationResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public AddImageEventOperationResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public AddImageEventOperationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddImageEventOperationResponseBodyData setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public AddImageEventOperationResponseBodyData setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

}
