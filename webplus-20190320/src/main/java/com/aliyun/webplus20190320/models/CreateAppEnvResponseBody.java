// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateAppEnvResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvChangeDetail")
    public CreateAppEnvResponseBodyEnvChangeDetail envChangeDetail;

    @NameInMap("Code")
    public String code;

    public static CreateAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppEnvResponseBody self = new CreateAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppEnvResponseBody setEnvChangeDetail(CreateAppEnvResponseBodyEnvChangeDetail envChangeDetail) {
        this.envChangeDetail = envChangeDetail;
        return this;
    }
    public CreateAppEnvResponseBodyEnvChangeDetail getEnvChangeDetail() {
        return this.envChangeDetail;
    }

    public CreateAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation extends TeaModel {
        @NameInMap("OperationDescription")
        public String operationDescription;

        @NameInMap("OperationType")
        public String operationType;

        public static CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation build(java.util.Map<String, ?> map) throws Exception {
            CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation self = new CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation();
            return TeaModel.build(map, self);
        }

        public CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }
        public String getOperationDescription() {
            return this.operationDescription;
        }

        public CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

    }

    public static class CreateAppEnvResponseBodyEnvChangeDetailOperations extends TeaModel {
        @NameInMap("Operation")
        public java.util.List<CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation;

        public static CreateAppEnvResponseBodyEnvChangeDetailOperations build(java.util.Map<String, ?> map) throws Exception {
            CreateAppEnvResponseBodyEnvChangeDetailOperations self = new CreateAppEnvResponseBodyEnvChangeDetailOperations();
            return TeaModel.build(map, self);
        }

        public CreateAppEnvResponseBodyEnvChangeDetailOperations setOperation(java.util.List<CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation> operation) {
            this.operation = operation;
            return this;
        }
        public java.util.List<CreateAppEnvResponseBodyEnvChangeDetailOperationsOperation> getOperation() {
            return this.operation;
        }

    }

    public static class CreateAppEnvResponseBodyEnvChangeDetail extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Operations")
        public CreateAppEnvResponseBodyEnvChangeDetailOperations operations;

        public static CreateAppEnvResponseBodyEnvChangeDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateAppEnvResponseBodyEnvChangeDetail self = new CreateAppEnvResponseBodyEnvChangeDetail();
            return TeaModel.build(map, self);
        }

        public CreateAppEnvResponseBodyEnvChangeDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateAppEnvResponseBodyEnvChangeDetail setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public CreateAppEnvResponseBodyEnvChangeDetail setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public CreateAppEnvResponseBodyEnvChangeDetail setOperations(CreateAppEnvResponseBodyEnvChangeDetailOperations operations) {
            this.operations = operations;
            return this;
        }
        public CreateAppEnvResponseBodyEnvChangeDetailOperations getOperations() {
            return this.operations;
        }

    }

}
