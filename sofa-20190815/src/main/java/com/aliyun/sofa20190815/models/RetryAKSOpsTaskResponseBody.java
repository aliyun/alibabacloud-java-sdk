// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryAKSOpsTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public RetryAKSOpsTaskResponseBodyData data;

    public static RetryAKSOpsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryAKSOpsTaskResponseBody self = new RetryAKSOpsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryAKSOpsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryAKSOpsTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryAKSOpsTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RetryAKSOpsTaskResponseBody setData(RetryAKSOpsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryAKSOpsTaskResponseBodyData getData() {
        return this.data;
    }

    public static class RetryAKSOpsTaskResponseBodyDataContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static RetryAKSOpsTaskResponseBodyDataContext build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataContext self = new RetryAKSOpsTaskResponseBodyDataContext();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RetryAKSOpsTaskResponseBodyDataContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity self = new RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyDataEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static RetryAKSOpsTaskResponseBodyDataEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyDataEntityRelation self = new RetryAKSOpsTaskResponseBodyDataEntityRelation();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public RetryAKSOpsTaskResponseBodyDataEntityRelation setTransitableWithStateEntity(RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class RetryAKSOpsTaskResponseBodyData extends TeaModel {
        @NameInMap("ActionHandlerCode")
        public String actionHandlerCode;

        @NameInMap("ArrangementId")
        public String arrangementId;

        @NameInMap("ServiceGroupCollectionId")
        public String serviceGroupCollectionId;

        @NameInMap("ServiceGroupId")
        public String serviceGroupId;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Context")
        public java.util.List<RetryAKSOpsTaskResponseBodyDataContext> context;

        @NameInMap("EntityRelation")
        public RetryAKSOpsTaskResponseBodyDataEntityRelation entityRelation;

        public static RetryAKSOpsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryAKSOpsTaskResponseBodyData self = new RetryAKSOpsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryAKSOpsTaskResponseBodyData setActionHandlerCode(String actionHandlerCode) {
            this.actionHandlerCode = actionHandlerCode;
            return this;
        }
        public String getActionHandlerCode() {
            return this.actionHandlerCode;
        }

        public RetryAKSOpsTaskResponseBodyData setArrangementId(String arrangementId) {
            this.arrangementId = arrangementId;
            return this;
        }
        public String getArrangementId() {
            return this.arrangementId;
        }

        public RetryAKSOpsTaskResponseBodyData setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public RetryAKSOpsTaskResponseBodyData setServiceGroupId(String serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public String getServiceGroupId() {
            return this.serviceGroupId;
        }

        public RetryAKSOpsTaskResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public RetryAKSOpsTaskResponseBodyData setContext(java.util.List<RetryAKSOpsTaskResponseBodyDataContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<RetryAKSOpsTaskResponseBodyDataContext> getContext() {
            return this.context;
        }

        public RetryAKSOpsTaskResponseBodyData setEntityRelation(RetryAKSOpsTaskResponseBodyDataEntityRelation entityRelation) {
            this.entityRelation = entityRelation;
            return this;
        }
        public RetryAKSOpsTaskResponseBodyDataEntityRelation getEntityRelation() {
            return this.entityRelation;
        }

    }

}
