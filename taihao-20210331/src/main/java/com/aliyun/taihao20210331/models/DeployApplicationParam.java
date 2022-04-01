// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployApplicationParam extends TeaModel {
    // applicationComponentDeploymentList
    @NameInMap("applicationComponentDeploymentList")
    public java.util.List<ApplicationComponentDeploymentList> applicationComponentDeploymentList;

    // applicationConfigList
    @NameInMap("applicationConfigList")
    public java.util.List<ApplicationConfigList> applicationConfigList;

    // applicationList
    @NameInMap("applicationList")
    public java.util.List<ApplicationList> applicationList;

    // autoRecommendConfig
    @NameInMap("autoRecommendConfig")
    public Boolean autoRecommendConfig;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // description
    @NameInMap("description")
    public String description;

    // nodeIdList
    @NameInMap("nodeIdList")
    public java.util.List<String> nodeIdList;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static DeployApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationParam self = new DeployApplicationParam();
        return TeaModel.build(map, self);
    }

    public DeployApplicationParam setApplicationComponentDeploymentList(java.util.List<ApplicationComponentDeploymentList> applicationComponentDeploymentList) {
        this.applicationComponentDeploymentList = applicationComponentDeploymentList;
        return this;
    }
    public java.util.List<ApplicationComponentDeploymentList> getApplicationComponentDeploymentList() {
        return this.applicationComponentDeploymentList;
    }

    public DeployApplicationParam setApplicationConfigList(java.util.List<ApplicationConfigList> applicationConfigList) {
        this.applicationConfigList = applicationConfigList;
        return this;
    }
    public java.util.List<ApplicationConfigList> getApplicationConfigList() {
        return this.applicationConfigList;
    }

    public DeployApplicationParam setApplicationList(java.util.List<ApplicationList> applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public java.util.List<ApplicationList> getApplicationList() {
        return this.applicationList;
    }

    public DeployApplicationParam setAutoRecommendConfig(Boolean autoRecommendConfig) {
        this.autoRecommendConfig = autoRecommendConfig;
        return this;
    }
    public Boolean getAutoRecommendConfig() {
        return this.autoRecommendConfig;
    }

    public DeployApplicationParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeployApplicationParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployApplicationParam setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    public DeployApplicationParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DeployApplicationParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public static class ApplicationComponentDeploymentList extends TeaModel {
        // applicationName
        @NameInMap("applicationName")
        public String applicationName;

        // componentName
        @NameInMap("componentName")
        public String componentName;

        // deployScope
        @NameInMap("deployScope")
        public String deployScope;

        // nodeGroupIdList
        @NameInMap("nodeGroupIdList")
        public java.util.List<String> nodeGroupIdList;

        // nodeIdList
        @NameInMap("nodeIdList")
        public java.util.List<String> nodeIdList;

        public static ApplicationComponentDeploymentList build(java.util.Map<String, ?> map) throws Exception {
            ApplicationComponentDeploymentList self = new ApplicationComponentDeploymentList();
            return TeaModel.build(map, self);
        }

        public ApplicationComponentDeploymentList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationComponentDeploymentList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ApplicationComponentDeploymentList setDeployScope(String deployScope) {
            this.deployScope = deployScope;
            return this;
        }
        public String getDeployScope() {
            return this.deployScope;
        }

        public ApplicationComponentDeploymentList setNodeGroupIdList(java.util.List<String> nodeGroupIdList) {
            this.nodeGroupIdList = nodeGroupIdList;
            return this;
        }
        public java.util.List<String> getNodeGroupIdList() {
            return this.nodeGroupIdList;
        }

        public ApplicationComponentDeploymentList setNodeIdList(java.util.List<String> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

    }

    public static class ApplicationConfigList extends TeaModel {
        // applicationName
        @NameInMap("applicationName")
        public String applicationName;

        // configFileName
        @NameInMap("configFileName")
        public String configFileName;

        // configItemKey
        @NameInMap("configItemKey")
        public String configItemKey;

        // configItemValue
        @NameInMap("configItemValue")
        public String configItemValue;

        // nodeGroupId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        public static ApplicationConfigList build(java.util.Map<String, ?> map) throws Exception {
            ApplicationConfigList self = new ApplicationConfigList();
            return TeaModel.build(map, self);
        }

        public ApplicationConfigList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationConfigList setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ApplicationConfigList setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ApplicationConfigList setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public ApplicationConfigList setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ApplicationConfigList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ApplicationList extends TeaModel {
        // applicationName
        @NameInMap("applicationName")
        public String applicationName;

        // applicationVersion
        @NameInMap("applicationVersion")
        public String applicationVersion;

        public static ApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ApplicationList self = new ApplicationList();
            return TeaModel.build(map, self);
        }

        public ApplicationList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationList setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

    }

}
