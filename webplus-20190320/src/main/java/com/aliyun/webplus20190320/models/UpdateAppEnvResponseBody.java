// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateAppEnvResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvChangeDetail")
    public UpdateAppEnvResponseBodyEnvChangeDetail envChangeDetail;

    @NameInMap("Code")
    public String code;

    public static UpdateAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppEnvResponseBody self = new UpdateAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppEnvResponseBody setEnvChangeDetail(UpdateAppEnvResponseBodyEnvChangeDetail envChangeDetail) {
        this.envChangeDetail = envChangeDetail;
        return this;
    }
    public UpdateAppEnvResponseBodyEnvChangeDetail getEnvChangeDetail() {
        return this.envChangeDetail;
    }

    public UpdateAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation extends TeaModel {
        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("OperationType")
        public String operationType;

        public static UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation self = new UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation();
            return TeaModel.build(map, self);
        }

        public UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

    }

    public static class UpdateAppEnvResponseBodyEnvChangeDetailOperations extends TeaModel {
        @NameInMap("Operation")
        public java.util.List<UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation;

        public static UpdateAppEnvResponseBodyEnvChangeDetailOperations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppEnvResponseBodyEnvChangeDetailOperations self = new UpdateAppEnvResponseBodyEnvChangeDetailOperations();
            return TeaModel.build(map, self);
        }

        public UpdateAppEnvResponseBodyEnvChangeDetailOperations setOperation(java.util.List<UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation) {
            this.operation = operation;
            return this;
        }
        public java.util.List<UpdateAppEnvResponseBodyEnvChangeDetailOperationsOperation> getOperation() {
            return this.operation;
        }

    }

    public static class UpdateAppEnvResponseBodyEnvChangeDetail extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Operations")
        public UpdateAppEnvResponseBodyEnvChangeDetailOperations operations;

        public static UpdateAppEnvResponseBodyEnvChangeDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppEnvResponseBodyEnvChangeDetail self = new UpdateAppEnvResponseBodyEnvChangeDetail();
            return TeaModel.build(map, self);
        }

        public UpdateAppEnvResponseBodyEnvChangeDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateAppEnvResponseBodyEnvChangeDetail setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public UpdateAppEnvResponseBodyEnvChangeDetail setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public UpdateAppEnvResponseBodyEnvChangeDetail setOperations(UpdateAppEnvResponseBodyEnvChangeDetailOperations operations) {
            this.operations = operations;
            return this;
        }
        public UpdateAppEnvResponseBodyEnvChangeDetailOperations getOperations() {
            return this.operations;
        }

    }

}
