// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // applicationVersion
    @NameInMap("applicationVersion")
    public String applicationVersion;

    public static ApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        ApplicationParam self = new ApplicationParam();
        return TeaModel.build(map, self);
    }

    public ApplicationParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationParam setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }
    public String getApplicationVersion() {
        return this.applicationVersion;
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
