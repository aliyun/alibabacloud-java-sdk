// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateConfigParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // configItemActions
    @NameInMap("configItemActions")
    public java.util.List<ConfigItemActions> configItemActions;

    // description
    @NameInMap("description")
    public String description;

    // dryRun
    @NameInMap("dryRun")
    public Boolean dryRun;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static UpdateConfigParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigParam self = new UpdateConfigParam();
        return TeaModel.build(map, self);
    }

    public UpdateConfigParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateConfigParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateConfigParam setConfigItemActions(java.util.List<ConfigItemActions> configItemActions) {
        this.configItemActions = configItemActions;
        return this;
    }
    public java.util.List<ConfigItemActions> getConfigItemActions() {
        return this.configItemActions;
    }

    public UpdateConfigParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConfigParam setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateConfigParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateConfigParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public static class ConfigItemActions extends TeaModel {
        // configAction
        @NameInMap("configAction")
        public String configAction;

        // configFileName
        @NameInMap("configFileName")
        public String configFileName;

        // configItemKey
        @NameInMap("configItemKey")
        public String configItemKey;

        // configItemValue
        @NameInMap("configItemValue")
        public String configItemValue;

        // effectiveActions
        @NameInMap("effectiveActions")
        public String effectiveActions;

        // effectiveType
        @NameInMap("effectiveType")
        public String effectiveType;

        // nodeGroupId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        public static ConfigItemActions build(java.util.Map<String, ?> map) throws Exception {
            ConfigItemActions self = new ConfigItemActions();
            return TeaModel.build(map, self);
        }

        public ConfigItemActions setConfigAction(String configAction) {
            this.configAction = configAction;
            return this;
        }
        public String getConfigAction() {
            return this.configAction;
        }

        public ConfigItemActions setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ConfigItemActions setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ConfigItemActions setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public ConfigItemActions setEffectiveActions(String effectiveActions) {
            this.effectiveActions = effectiveActions;
            return this;
        }
        public String getEffectiveActions() {
            return this.effectiveActions;
        }

        public ConfigItemActions setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public ConfigItemActions setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ConfigItemActions setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
