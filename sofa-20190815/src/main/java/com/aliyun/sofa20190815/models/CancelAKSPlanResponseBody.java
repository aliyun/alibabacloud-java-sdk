// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CancelAKSPlanResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CancelAKSPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSPlanResponseBody self = new CancelAKSPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAKSPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelAKSPlanResponseBody setData(CancelAKSPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelAKSPlanResponseBodyData getData() {
        return this.data;
    }

    public CancelAKSPlanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CancelAKSPlanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CancelAKSPlanResponseBodyDataContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CancelAKSPlanResponseBodyDataContext build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataContext self = new CancelAKSPlanResponseBodyDataContext();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CancelAKSPlanResponseBodyDataContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TenantId")
        public String tenantId;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("EnvEntity")
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetails")
        public java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> messageDetails;

        @NameInMap("MessageParams")
        public java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("ErrorCode")
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        @NameInMap("EnvExecutableEntity")
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetails(java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> messageDetails) {
            this.messageDetails = messageDetails;
            return this;
        }
        public java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetails> getMessageDetails() {
            return this.messageDetails;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

    }

    public static class CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity extends TeaModel {
        @NameInMap("EnvExecutableEntityWithResult")
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        @NameInMap("State")
        public String state;

        public static CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity self = new CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity setEnvExecutableEntityWithResult(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class CancelAKSPlanResponseBodyData extends TeaModel {
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
        public java.util.List<CancelAKSPlanResponseBodyDataContext> context;

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
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity baseTransitableWithStateEntity;

        @NameInMap("LastOperator")
        public String lastOperator;

        public static CancelAKSPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelAKSPlanResponseBodyData self = new CancelAKSPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelAKSPlanResponseBodyData setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public CancelAKSPlanResponseBodyData setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public CancelAKSPlanResponseBodyData setTimeSeriesId(String timeSeriesId) {
            this.timeSeriesId = timeSeriesId;
            return this;
        }
        public String getTimeSeriesId() {
            return this.timeSeriesId;
        }

        public CancelAKSPlanResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CancelAKSPlanResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CancelAKSPlanResponseBodyData setContext(java.util.List<CancelAKSPlanResponseBodyDataContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<CancelAKSPlanResponseBodyDataContext> getContext() {
            return this.context;
        }

        public CancelAKSPlanResponseBodyData setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public CancelAKSPlanResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CancelAKSPlanResponseBodyData setInitialByTag(String initialByTag) {
            this.initialByTag = initialByTag;
            return this;
        }
        public String getInitialByTag() {
            return this.initialByTag;
        }

        public CancelAKSPlanResponseBodyData setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public CancelAKSPlanResponseBodyData setLastOperatorId(String lastOperatorId) {
            this.lastOperatorId = lastOperatorId;
            return this;
        }
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        public CancelAKSPlanResponseBodyData setAutoExecution(Boolean autoExecution) {
            this.autoExecution = autoExecution;
            return this;
        }
        public Boolean getAutoExecution() {
            return this.autoExecution;
        }

        public CancelAKSPlanResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CancelAKSPlanResponseBodyData setBaseTransitableWithStateEntity(CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity baseTransitableWithStateEntity) {
            this.baseTransitableWithStateEntity = baseTransitableWithStateEntity;
            return this;
        }
        public CancelAKSPlanResponseBodyDataBaseTransitableWithStateEntity getBaseTransitableWithStateEntity() {
            return this.baseTransitableWithStateEntity;
        }

        public CancelAKSPlanResponseBodyData setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

    }

}
