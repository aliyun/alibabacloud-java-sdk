// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationConditionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeImageEventOperationConditionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageEventOperationConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationConditionResponseBody self = new DescribeImageEventOperationConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationConditionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageEventOperationConditionResponseBody setData(DescribeImageEventOperationConditionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageEventOperationConditionResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageEventOperationConditionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageEventOperationConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageEventOperationConditionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageEventOperationConditionResponseBodyDataOperationsConditions extends TeaModel {
        @NameInMap("ConditionKey")
        public String conditionKey;

        @NameInMap("ConditionName")
        public String conditionName;

        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        public static DescribeImageEventOperationConditionResponseBodyDataOperationsConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationConditionResponseBodyDataOperationsConditions self = new DescribeImageEventOperationConditionResponseBodyDataOperationsConditions();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperationsConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperationsConditions setConditionName(String conditionName) {
            this.conditionName = conditionName;
            return this;
        }
        public String getConditionName() {
            return this.conditionName;
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperationsConditions setSupportedMisType(java.util.List<String> supportedMisType) {
            this.supportedMisType = supportedMisType;
            return this;
        }
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

    }

    public static class DescribeImageEventOperationConditionResponseBodyDataOperations extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperationsConditions> conditions;

        @NameInMap("OperationCode")
        public String operationCode;

        @NameInMap("OperationName")
        public String operationName;

        public static DescribeImageEventOperationConditionResponseBodyDataOperations build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationConditionResponseBodyDataOperations self = new DescribeImageEventOperationConditionResponseBodyDataOperations();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperations setConditions(java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperationsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperationsConditions> getConditions() {
            return this.conditions;
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperations setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public DescribeImageEventOperationConditionResponseBodyDataOperations setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

    }

    public static class DescribeImageEventOperationConditionResponseBodyData extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Operations")
        public java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperations> operations;

        @NameInMap("Scenarios")
        public java.util.List<String> scenarios;

        public static DescribeImageEventOperationConditionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageEventOperationConditionResponseBodyData self = new DescribeImageEventOperationConditionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageEventOperationConditionResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeImageEventOperationConditionResponseBodyData setOperations(java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<DescribeImageEventOperationConditionResponseBodyDataOperations> getOperations() {
            return this.operations;
        }

        public DescribeImageEventOperationConditionResponseBodyData setScenarios(java.util.List<String> scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public java.util.List<String> getScenarios() {
            return this.scenarios;
        }

    }

}
