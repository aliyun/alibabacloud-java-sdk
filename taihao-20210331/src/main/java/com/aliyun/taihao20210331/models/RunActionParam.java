// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RunActionParam extends TeaModel {
    // actionName
    @NameInMap("actionName")
    public String actionName;

    // actionParams
    @NameInMap("actionParams")
    public java.util.Map<String, String> actionParams;

    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // componentInstanceParams
    @NameInMap("componentInstanceParams")
    public java.util.List<ComponentInstanceParams> componentInstanceParams;

    // componentNames
    @NameInMap("componentNames")
    public java.util.List<String> componentNames;

    // description
    @NameInMap("description")
    public String description;

    // executeFailStrategy
    @NameInMap("executeFailStrategy")
    public String executeFailStrategy;

    // interval
    @NameInMap("interval")
    public Integer interval;

    // nodeCountPerBatch
    @NameInMap("nodeCountPerBatch")
    public Integer nodeCountPerBatch;

    // nodeGroupIds
    @NameInMap("nodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    // nodeIds
    @NameInMap("nodeIds")
    public java.util.List<String> nodeIds;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // runActionScope
    @NameInMap("runActionScope")
    public String runActionScope;

    // turnOnMaintenanceMode
    @NameInMap("turnOnMaintenanceMode")
    public Boolean turnOnMaintenanceMode;

    public static RunActionParam build(java.util.Map<String, ?> map) throws Exception {
        RunActionParam self = new RunActionParam();
        return TeaModel.build(map, self);
    }

    public RunActionParam setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public RunActionParam setActionParams(java.util.Map<String, String> actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public java.util.Map<String, String> getActionParams() {
        return this.actionParams;
    }

    public RunActionParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public RunActionParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunActionParam setComponentInstanceParams(java.util.List<ComponentInstanceParams> componentInstanceParams) {
        this.componentInstanceParams = componentInstanceParams;
        return this;
    }
    public java.util.List<ComponentInstanceParams> getComponentInstanceParams() {
        return this.componentInstanceParams;
    }

    public RunActionParam setComponentNames(java.util.List<String> componentNames) {
        this.componentNames = componentNames;
        return this;
    }
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    public RunActionParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunActionParam setExecuteFailStrategy(String executeFailStrategy) {
        this.executeFailStrategy = executeFailStrategy;
        return this;
    }
    public String getExecuteFailStrategy() {
        return this.executeFailStrategy;
    }

    public RunActionParam setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public RunActionParam setNodeCountPerBatch(Integer nodeCountPerBatch) {
        this.nodeCountPerBatch = nodeCountPerBatch;
        return this;
    }
    public Integer getNodeCountPerBatch() {
        return this.nodeCountPerBatch;
    }

    public RunActionParam setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public RunActionParam setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public RunActionParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public RunActionParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public RunActionParam setRunActionScope(String runActionScope) {
        this.runActionScope = runActionScope;
        return this;
    }
    public String getRunActionScope() {
        return this.runActionScope;
    }

    public RunActionParam setTurnOnMaintenanceMode(Boolean turnOnMaintenanceMode) {
        this.turnOnMaintenanceMode = turnOnMaintenanceMode;
        return this;
    }
    public Boolean getTurnOnMaintenanceMode() {
        return this.turnOnMaintenanceMode;
    }

    public static class ComponentInstanceParams extends TeaModel {
        // componentName
        @NameInMap("componentName")
        public String componentName;

        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        public static ComponentInstanceParams build(java.util.Map<String, ?> map) throws Exception {
            ComponentInstanceParams self = new ComponentInstanceParams();
            return TeaModel.build(map, self);
        }

        public ComponentInstanceParams setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ComponentInstanceParams setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
