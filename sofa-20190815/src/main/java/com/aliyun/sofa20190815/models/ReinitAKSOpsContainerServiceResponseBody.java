// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitAKSOpsContainerServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ReinitAKSOpsContainerServiceResponseBodyData data;

    public static ReinitAKSOpsContainerServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReinitAKSOpsContainerServiceResponseBody self = new ReinitAKSOpsContainerServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReinitAKSOpsContainerServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReinitAKSOpsContainerServiceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReinitAKSOpsContainerServiceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ReinitAKSOpsContainerServiceResponseBody setData(ReinitAKSOpsContainerServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReinitAKSOpsContainerServiceResponseBodyData getData() {
        return this.data;
    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig self = new ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks extends TeaModel {
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
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext> context;

        @NameInMap("EntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation entityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setActionHandlerCode(String actionHandlerCode) {
            this.actionHandlerCode = actionHandlerCode;
            return this;
        }
        public String getActionHandlerCode() {
            return this.actionHandlerCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setArrangementId(String arrangementId) {
            this.arrangementId = arrangementId;
            return this;
        }
        public String getArrangementId() {
            return this.arrangementId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setServiceGroupId(String serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public String getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setContext(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksContext> getContext() {
            return this.context;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks setEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation entityRelation) {
            this.entityRelation = entityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasksEntityRelation getEntityRelation() {
            return this.entityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement extends TeaModel {
        @NameInMap("ArrangementType")
        public String arrangementType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceGroupCollectionId")
        public String serviceGroupCollectionId;

        @NameInMap("ActionTypes")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes> actionTypes;

        @NameInMap("OpsGenericEnvConfig")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig;

        @NameInMap("OpsGenericEntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setArrangementType(String arrangementType) {
            this.arrangementType = arrangementType;
            return this;
        }
        public String getArrangementType() {
            return this.arrangementType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setActionTypes(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes> actionTypes) {
            this.actionTypes = actionTypes;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementActionTypes> getActionTypes() {
            return this.actionTypes;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setOpsGenericEnvConfig(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig) {
            this.opsGenericEnvConfig = opsGenericEnvConfig;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> getOpsGenericEnvConfig() {
            return this.opsGenericEnvConfig;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement setOpsGenericEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation) {
            this.opsGenericEntityRelation = opsGenericEntityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation getOpsGenericEntityRelation() {
            return this.opsGenericEntityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements extends TeaModel {
        @NameInMap("Tasks")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks> tasks;

        @NameInMap("OpsGenericArrangement")
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement opsGenericArrangement;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements self = new ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements setTasks(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsTasks> getTasks() {
            return this.tasks;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements setOpsGenericArrangement(ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement opsGenericArrangement) {
            this.opsGenericArrangement = opsGenericArrangement;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangementsOpsGenericArrangement getOpsGenericArrangement() {
            return this.opsGenericArrangement;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks extends TeaModel {
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
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext> context;

        @NameInMap("EntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation entityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setActionHandlerCode(String actionHandlerCode) {
            this.actionHandlerCode = actionHandlerCode;
            return this;
        }
        public String getActionHandlerCode() {
            return this.actionHandlerCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setArrangementId(String arrangementId) {
            this.arrangementId = arrangementId;
            return this;
        }
        public String getArrangementId() {
            return this.arrangementId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setServiceGroupId(String serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public String getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setContext(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksContext> getContext() {
            return this.context;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks setEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation entityRelation) {
            this.entityRelation = entityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasksEntityRelation getEntityRelation() {
            return this.entityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement extends TeaModel {
        @NameInMap("ArrangementType")
        public String arrangementType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceGroupCollectionId")
        public String serviceGroupCollectionId;

        @NameInMap("ActionTypes")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes> actionTypes;

        @NameInMap("OpsGenericEnvConfig")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig;

        @NameInMap("OpsGenericEntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setArrangementType(String arrangementType) {
            this.arrangementType = arrangementType;
            return this;
        }
        public String getArrangementType() {
            return this.arrangementType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setActionTypes(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes> actionTypes) {
            this.actionTypes = actionTypes;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementActionTypes> getActionTypes() {
            return this.actionTypes;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setOpsGenericEnvConfig(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig) {
            this.opsGenericEnvConfig = opsGenericEnvConfig;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEnvConfig> getOpsGenericEnvConfig() {
            return this.opsGenericEnvConfig;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement setOpsGenericEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation) {
            this.opsGenericEntityRelation = opsGenericEntityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangementOpsGenericEntityRelation getOpsGenericEntityRelation() {
            return this.opsGenericEntityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements extends TeaModel {
        @NameInMap("Tasks")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks> tasks;

        @NameInMap("OpsGenericArrangement")
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement opsGenericArrangement;

        public static ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements self = new ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements setTasks(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsTasks> getTasks() {
            return this.tasks;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements setOpsGenericArrangement(ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement opsGenericArrangement) {
            this.opsGenericArrangement = opsGenericArrangement;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangementsOpsGenericArrangement getOpsGenericArrangement() {
            return this.opsGenericArrangement;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks extends TeaModel {
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
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext> context;

        @NameInMap("EntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation entityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setActionHandlerCode(String actionHandlerCode) {
            this.actionHandlerCode = actionHandlerCode;
            return this;
        }
        public String getActionHandlerCode() {
            return this.actionHandlerCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setArrangementId(String arrangementId) {
            this.arrangementId = arrangementId;
            return this;
        }
        public String getArrangementId() {
            return this.arrangementId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setServiceGroupId(String serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public String getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setContext(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext> context) {
            this.context = context;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksContext> getContext() {
            return this.context;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks setEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation entityRelation) {
            this.entityRelation = entityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasksEntityRelation getEntityRelation() {
            return this.entityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity setEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("EnvEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity setEnvEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode extends TeaModel {
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

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult extends TeaModel {
        @NameInMap("MessageDetail")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail;

        @NameInMap("MessageParams")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams;

        @NameInMap("EnvExecutableEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity;

        @NameInMap("ErrorCode")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageDetail(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> messageDetail) {
            this.messageDetail = messageDetail;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageDetail> getMessageDetail() {
            return this.messageDetail;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setMessageParams(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultMessageParams> getMessageParams() {
            return this.messageParams;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setEnvExecutableEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity envExecutableEntity) {
            this.envExecutableEntity = envExecutableEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultEnvExecutableEntity getEnvExecutableEntity() {
            return this.envExecutableEntity;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult setErrorCode(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResultErrorCode getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("EnvExecutableEntityWithResult")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity setEnvExecutableEntityWithResult(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult envExecutableEntityWithResult) {
            this.envExecutableEntityWithResult = envExecutableEntityWithResult;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntityEnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
            return this.envExecutableEntityWithResult;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation extends TeaModel {
        @NameInMap("ParentEntityType")
        public String parentEntityType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("TransitableWithStateEntity")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation setParentEntityType(String parentEntityType) {
            this.parentEntityType = parentEntityType;
            return this;
        }
        public String getParentEntityType() {
            return this.parentEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation setTransitableWithStateEntity(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity transitableWithStateEntity) {
            this.transitableWithStateEntity = transitableWithStateEntity;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelationTransitableWithStateEntity getTransitableWithStateEntity() {
            return this.transitableWithStateEntity;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement extends TeaModel {
        @NameInMap("ArrangementType")
        public String arrangementType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceGroupCollectionId")
        public String serviceGroupCollectionId;

        @NameInMap("ActionTypes")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes> actionTypes;

        @NameInMap("OpsGenericEnvConfig")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig;

        @NameInMap("OpsGenericEntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setArrangementType(String arrangementType) {
            this.arrangementType = arrangementType;
            return this;
        }
        public String getArrangementType() {
            return this.arrangementType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setActionTypes(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes> actionTypes) {
            this.actionTypes = actionTypes;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementActionTypes> getActionTypes() {
            return this.actionTypes;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setOpsGenericEnvConfig(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig> opsGenericEnvConfig) {
            this.opsGenericEnvConfig = opsGenericEnvConfig;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEnvConfig> getOpsGenericEnvConfig() {
            return this.opsGenericEnvConfig;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement setOpsGenericEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation opsGenericEntityRelation) {
            this.opsGenericEntityRelation = opsGenericEntityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangementOpsGenericEntityRelation getOpsGenericEntityRelation() {
            return this.opsGenericEntityRelation;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement extends TeaModel {
        @NameInMap("Tasks")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks> tasks;

        @NameInMap("OpsGenericArrangement")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement opsGenericArrangement;

        public static ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement self = new ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement setTasks(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementTasks> getTasks() {
            return this.tasks;
        }

        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement setOpsGenericArrangement(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement opsGenericArrangement) {
            this.opsGenericArrangement = opsGenericArrangement;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangementOpsGenericArrangement getOpsGenericArrangement() {
            return this.opsGenericArrangement;
        }

    }

    public static class ReinitAKSOpsContainerServiceResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ArrangementId")
        public String arrangementId;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("ExecutorName")
        public String executorName;

        @NameInMap("GrayTraffic")
        public Boolean grayTraffic;

        @NameInMap("IsRollbackType")
        public Boolean isRollbackType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("OpsType")
        public String opsType;

        @NameInMap("ResultContext")
        public String resultContext;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("RollbackEntityId")
        public String rollbackEntityId;

        @NameInMap("RollbackEntityType")
        public String rollbackEntityType;

        @NameInMap("RollbackRevision")
        public String rollbackRevision;

        @NameInMap("ServiceGroupCollectionId")
        public String serviceGroupCollectionId;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("EnvConfig")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig> envConfig;

        @NameInMap("PostDeploymentArrangements")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements> postDeploymentArrangements;

        @NameInMap("PreDeploymentArrangements")
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements> preDeploymentArrangements;

        @NameInMap("BaseEntityRelation")
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation baseEntityRelation;

        @NameInMap("DeploymentArrangement")
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement deploymentArrangement;

        public static ReinitAKSOpsContainerServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReinitAKSOpsContainerServiceResponseBodyData self = new ReinitAKSOpsContainerServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setArrangementId(String arrangementId) {
            this.arrangementId = arrangementId;
            return this;
        }
        public String getArrangementId() {
            return this.arrangementId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setGrayTraffic(Boolean grayTraffic) {
            this.grayTraffic = grayTraffic;
            return this;
        }
        public Boolean getGrayTraffic() {
            return this.grayTraffic;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setIsRollbackType(Boolean isRollbackType) {
            this.isRollbackType = isRollbackType;
            return this;
        }
        public Boolean getIsRollbackType() {
            return this.isRollbackType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setResultContext(String resultContext) {
            this.resultContext = resultContext;
            return this;
        }
        public String getResultContext() {
            return this.resultContext;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setRollbackEntityId(String rollbackEntityId) {
            this.rollbackEntityId = rollbackEntityId;
            return this;
        }
        public String getRollbackEntityId() {
            return this.rollbackEntityId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setRollbackEntityType(String rollbackEntityType) {
            this.rollbackEntityType = rollbackEntityType;
            return this;
        }
        public String getRollbackEntityType() {
            return this.rollbackEntityType;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setRollbackRevision(String rollbackRevision) {
            this.rollbackRevision = rollbackRevision;
            return this;
        }
        public String getRollbackRevision() {
            return this.rollbackRevision;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setServiceGroupCollectionId(String serviceGroupCollectionId) {
            this.serviceGroupCollectionId = serviceGroupCollectionId;
            return this;
        }
        public String getServiceGroupCollectionId() {
            return this.serviceGroupCollectionId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setEnvConfig(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig> envConfig) {
            this.envConfig = envConfig;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataEnvConfig> getEnvConfig() {
            return this.envConfig;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setPostDeploymentArrangements(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements> postDeploymentArrangements) {
            this.postDeploymentArrangements = postDeploymentArrangements;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPostDeploymentArrangements> getPostDeploymentArrangements() {
            return this.postDeploymentArrangements;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setPreDeploymentArrangements(java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements> preDeploymentArrangements) {
            this.preDeploymentArrangements = preDeploymentArrangements;
            return this;
        }
        public java.util.List<ReinitAKSOpsContainerServiceResponseBodyDataPreDeploymentArrangements> getPreDeploymentArrangements() {
            return this.preDeploymentArrangements;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setBaseEntityRelation(ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation baseEntityRelation) {
            this.baseEntityRelation = baseEntityRelation;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataBaseEntityRelation getBaseEntityRelation() {
            return this.baseEntityRelation;
        }

        public ReinitAKSOpsContainerServiceResponseBodyData setDeploymentArrangement(ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement deploymentArrangement) {
            this.deploymentArrangement = deploymentArrangement;
            return this;
        }
        public ReinitAKSOpsContainerServiceResponseBodyDataDeploymentArrangement getDeploymentArrangement() {
            return this.deploymentArrangement;
        }

    }

}
