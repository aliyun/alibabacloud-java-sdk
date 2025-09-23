// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ExecuteMigrationOperationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ExecuteMigrationOperationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>814BCD66-2D76-5080-AAD2-E50E5BDB0995</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteMigrationOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMigrationOperationResponseBody self = new ExecuteMigrationOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteMigrationOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteMigrationOperationResponseBody setData(ExecuteMigrationOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteMigrationOperationResponseBodyData getData() {
        return this.data;
    }

    public ExecuteMigrationOperationResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ExecuteMigrationOperationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ExecuteMigrationOperationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteMigrationOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteMigrationOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteMigrationOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteMigrationOperationResponseBodyDataOperationParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("paramData")
        public Object paramData;

        public static ExecuteMigrationOperationResponseBodyDataOperationParam build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMigrationOperationResponseBodyDataOperationParam self = new ExecuteMigrationOperationResponseBodyDataOperationParam();
            return TeaModel.build(map, self);
        }

        public ExecuteMigrationOperationResponseBodyDataOperationParam setParamData(Object paramData) {
            this.paramData = paramData;
            return this;
        }
        public Object getParamData() {
            return this.paramData;
        }

    }

    public static class ExecuteMigrationOperationResponseBodyDataOperationResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("resultData")
        public Object resultData;

        public static ExecuteMigrationOperationResponseBodyDataOperationResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMigrationOperationResponseBodyDataOperationResult self = new ExecuteMigrationOperationResponseBodyDataOperationResult();
            return TeaModel.build(map, self);
        }

        public ExecuteMigrationOperationResponseBodyDataOperationResult setResultData(Object resultData) {
            this.resultData = resultData;
            return this;
        }
        public Object getResultData() {
            return this.resultData;
        }

    }

    public static class ExecuteMigrationOperationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MIGRATE_WAIT</p>
         */
        @NameInMap("businessStatus")
        public String businessStatus;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("migrationId")
        public Long migrationId;

        /**
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("operationId")
        public Long operationId;

        /**
         * <strong>example:</strong>
         * <p>group01</p>
         */
        @NameInMap("operationKey")
        public String operationKey;

        @NameInMap("operationParam")
        public ExecuteMigrationOperationResponseBodyDataOperationParam operationParam;

        @NameInMap("operationResult")
        public ExecuteMigrationOperationResponseBodyDataOperationResult operationResult;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <strong>example:</strong>
         * <p>CONNECT_NETWORK</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <strong>example:</strong>
         * <p>MIGRATE_METADATA</p>
         */
        @NameInMap("stageType")
        public String stageType;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ExecuteMigrationOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMigrationOperationResponseBodyData self = new ExecuteMigrationOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteMigrationOperationResponseBodyData setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ExecuteMigrationOperationResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ExecuteMigrationOperationResponseBodyData setMigrationId(Long migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public Long getMigrationId() {
            return this.migrationId;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationKey(String operationKey) {
            this.operationKey = operationKey;
            return this;
        }
        public String getOperationKey() {
            return this.operationKey;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationParam(ExecuteMigrationOperationResponseBodyDataOperationParam operationParam) {
            this.operationParam = operationParam;
            return this;
        }
        public ExecuteMigrationOperationResponseBodyDataOperationParam getOperationParam() {
            return this.operationParam;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationResult(ExecuteMigrationOperationResponseBodyDataOperationResult operationResult) {
            this.operationResult = operationResult;
            return this;
        }
        public ExecuteMigrationOperationResponseBodyDataOperationResult getOperationResult() {
            return this.operationResult;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ExecuteMigrationOperationResponseBodyData setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ExecuteMigrationOperationResponseBodyData setStageType(String stageType) {
            this.stageType = stageType;
            return this;
        }
        public String getStageType() {
            return this.stageType;
        }

        public ExecuteMigrationOperationResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
