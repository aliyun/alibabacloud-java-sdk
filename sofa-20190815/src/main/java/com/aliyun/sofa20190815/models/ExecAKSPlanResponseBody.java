// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExecAKSPlanResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecAKSPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSPlanResponseBody self = new ExecAKSPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecAKSPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAKSPlanResponseBody setData(ExecAKSPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecAKSPlanResponseBodyData getData() {
        return this.data;
    }

    public ExecAKSPlanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecAKSPlanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecAKSPlanResponseBodyDataContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExecAKSPlanResponseBodyDataContext build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataContext self = new ExecAKSPlanResponseBodyDataContext();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecAKSPlanResponseBodyDataContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TenantId")
        public String tenantId;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("EnvEntity")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetails")
        public java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> messageDetails;

        @NameInMap("MessageParams")
        public java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("ErrorCode")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        @NameInMap("EnvExecutableEntity")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetails(java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> messageDetails) {
            this.messageDetails = messageDetails;
            return this;
        }
        public java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> getMessageDetails() {
            return this.messageDetails;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

    }

    public static class ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity extends TeaModel {
        @NameInMap("EnvExecutableEntityWithResult")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        @NameInMap("State")
        public String state;

        public static ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity self = new ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity setEnvExecutableEntityWithResult(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ExecAKSPlanResponseBodyData extends TeaModel {
        @NameInMap("ExecutorName")
        public String executorName;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("TimeSeriesId")
        public String timeSeriesId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Context")
        public java.util.List<ExecAKSPlanResponseBodyDataContext> context;

        @NameInMap("OpsType")
        public String opsType;

        @NameInMap("Description")
        public String description;

        @NameInMap("InitialByTag")
        public String initialByTag;

        @NameInMap("AppCount")
        public Long appCount;

        @NameInMap("LastOperatorId")
        public String lastOperatorId;

        @NameInMap("AutoExecution")
        public Boolean autoExecution;

        @NameInMap("Name")
        public String name;

        @NameInMap("BaseTransitableWithStateEntity")
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity baseTransitableWithStateEntity;

        @NameInMap("LastOperator")
        public String lastOperator;

        public static ExecAKSPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSPlanResponseBodyData self = new ExecAKSPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecAKSPlanResponseBodyData setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public ExecAKSPlanResponseBodyData setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ExecAKSPlanResponseBodyData setTimeSeriesId(String timeSeriesId) {
            this.timeSeriesId = timeSeriesId;
            return this;
        }
        public String getTimeSeriesId() {
            return this.timeSeriesId;
        }

        public ExecAKSPlanResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ExecAKSPlanResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ExecAKSPlanResponseBodyData setContext(java.util.List<ExecAKSPlanResponseBodyDataContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<ExecAKSPlanResponseBodyDataContext> getContext() {
            return this.context;
        }

        public ExecAKSPlanResponseBodyData setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public ExecAKSPlanResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecAKSPlanResponseBodyData setInitialByTag(String initialByTag) {
            this.initialByTag = initialByTag;
            return this;
        }
        public String getInitialByTag() {
            return this.initialByTag;
        }

        public ExecAKSPlanResponseBodyData setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public ExecAKSPlanResponseBodyData setLastOperatorId(String lastOperatorId) {
            this.lastOperatorId = lastOperatorId;
            return this;
        }
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        public ExecAKSPlanResponseBodyData setAutoExecution(Boolean autoExecution) {
            this.autoExecution = autoExecution;
            return this;
        }
        public Boolean getAutoExecution() {
            return this.autoExecution;
        }

        public ExecAKSPlanResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecAKSPlanResponseBodyData setBaseTransitableWithStateEntity(ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity baseTransitableWithStateEntity) {
            this.baseTransitableWithStateEntity = baseTransitableWithStateEntity;
            return this;
        }
        public ExecAKSPlanResponseBodyDataBaseTransitableWithStateEntity getBaseTransitableWithStateEntity() {
            return this.baseTransitableWithStateEntity;
        }

        public ExecAKSPlanResponseBodyData setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

    }

}
