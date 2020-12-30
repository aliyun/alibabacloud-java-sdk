// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RebuildAppEnvResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvChangeDetail")
    public RebuildAppEnvResponseBodyEnvChangeDetail envChangeDetail;

    @NameInMap("Code")
    public String code;

    public static RebuildAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppEnvResponseBody self = new RebuildAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RebuildAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildAppEnvResponseBody setEnvChangeDetail(RebuildAppEnvResponseBodyEnvChangeDetail envChangeDetail) {
        this.envChangeDetail = envChangeDetail;
        return this;
    }
    public RebuildAppEnvResponseBodyEnvChangeDetail getEnvChangeDetail() {
        return this.envChangeDetail;
    }

    public RebuildAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation extends TeaModel {
        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("OperationType")
        public String operationType;

        public static RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation build(java.util.Map<String, ?> map) throws Exception {
            RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation self = new RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation();
            return TeaModel.build(map, self);
        }

        public RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

    }

    public static class RebuildAppEnvResponseBodyEnvChangeDetailOperations extends TeaModel {
        @NameInMap("Operation")
        public java.util.List<RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation;

        public static RebuildAppEnvResponseBodyEnvChangeDetailOperations build(java.util.Map<String, ?> map) throws Exception {
            RebuildAppEnvResponseBodyEnvChangeDetailOperations self = new RebuildAppEnvResponseBodyEnvChangeDetailOperations();
            return TeaModel.build(map, self);
        }

        public RebuildAppEnvResponseBodyEnvChangeDetailOperations setOperation(java.util.List<RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation) {
            this.operation = operation;
            return this;
        }
        public java.util.List<RebuildAppEnvResponseBodyEnvChangeDetailOperationsOperation> getOperation() {
            return this.operation;
        }

    }

    public static class RebuildAppEnvResponseBodyEnvChangeDetail extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Operations")
        public RebuildAppEnvResponseBodyEnvChangeDetailOperations operations;

        public static RebuildAppEnvResponseBodyEnvChangeDetail build(java.util.Map<String, ?> map) throws Exception {
            RebuildAppEnvResponseBodyEnvChangeDetail self = new RebuildAppEnvResponseBodyEnvChangeDetail();
            return TeaModel.build(map, self);
        }

        public RebuildAppEnvResponseBodyEnvChangeDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public RebuildAppEnvResponseBodyEnvChangeDetail setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public RebuildAppEnvResponseBodyEnvChangeDetail setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public RebuildAppEnvResponseBodyEnvChangeDetail setOperations(RebuildAppEnvResponseBodyEnvChangeDetailOperations operations) {
            this.operations = operations;
            return this;
        }
        public RebuildAppEnvResponseBodyEnvChangeDetailOperations getOperations() {
            return this.operations;
        }

    }

}
