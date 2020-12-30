// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class TerminateAppEnvResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvChangeDetail")
    public TerminateAppEnvResponseBodyEnvChangeDetail envChangeDetail;

    @NameInMap("Code")
    public String code;

    public static TerminateAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateAppEnvResponseBody self = new TerminateAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TerminateAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateAppEnvResponseBody setEnvChangeDetail(TerminateAppEnvResponseBodyEnvChangeDetail envChangeDetail) {
        this.envChangeDetail = envChangeDetail;
        return this;
    }
    public TerminateAppEnvResponseBodyEnvChangeDetail getEnvChangeDetail() {
        return this.envChangeDetail;
    }

    public TerminateAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation extends TeaModel {
        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("OperationType")
        public String operationType;

        public static TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation build(java.util.Map<String, ?> map) throws Exception {
            TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation self = new TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation();
            return TeaModel.build(map, self);
        }

        public TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

    }

    public static class TerminateAppEnvResponseBodyEnvChangeDetailOperations extends TeaModel {
        @NameInMap("Operation")
        public java.util.List<TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation;

        public static TerminateAppEnvResponseBodyEnvChangeDetailOperations build(java.util.Map<String, ?> map) throws Exception {
            TerminateAppEnvResponseBodyEnvChangeDetailOperations self = new TerminateAppEnvResponseBodyEnvChangeDetailOperations();
            return TeaModel.build(map, self);
        }

        public TerminateAppEnvResponseBodyEnvChangeDetailOperations setOperation(java.util.List<TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation) {
            this.operation = operation;
            return this;
        }
        public java.util.List<TerminateAppEnvResponseBodyEnvChangeDetailOperationsOperation> getOperation() {
            return this.operation;
        }

    }

    public static class TerminateAppEnvResponseBodyEnvChangeDetail extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Operations")
        public TerminateAppEnvResponseBodyEnvChangeDetailOperations operations;

        public static TerminateAppEnvResponseBodyEnvChangeDetail build(java.util.Map<String, ?> map) throws Exception {
            TerminateAppEnvResponseBodyEnvChangeDetail self = new TerminateAppEnvResponseBodyEnvChangeDetail();
            return TeaModel.build(map, self);
        }

        public TerminateAppEnvResponseBodyEnvChangeDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TerminateAppEnvResponseBodyEnvChangeDetail setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public TerminateAppEnvResponseBodyEnvChangeDetail setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public TerminateAppEnvResponseBodyEnvChangeDetail setOperations(TerminateAppEnvResponseBodyEnvChangeDetailOperations operations) {
            this.operations = operations;
            return this;
        }
        public TerminateAppEnvResponseBodyEnvChangeDetailOperations getOperations() {
            return this.operations;
        }

    }

}
