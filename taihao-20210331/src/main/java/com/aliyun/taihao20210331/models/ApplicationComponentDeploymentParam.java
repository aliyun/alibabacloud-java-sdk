// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationComponentDeploymentParam extends TeaModel {
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

    public static ApplicationComponentDeploymentParam build(java.util.Map<String, ?> map) throws Exception {
        ApplicationComponentDeploymentParam self = new ApplicationComponentDeploymentParam();
        return TeaModel.build(map, self);
    }

    public ApplicationComponentDeploymentParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationComponentDeploymentParam setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ApplicationComponentDeploymentParam setDeployScope(String deployScope) {
        this.deployScope = deployScope;
        return this;
    }
    public String getDeployScope() {
        return this.deployScope;
    }

    public ApplicationComponentDeploymentParam setNodeGroupIdList(java.util.List<String> nodeGroupIdList) {
        this.nodeGroupIdList = nodeGroupIdList;
        return this;
    }
    public java.util.List<String> getNodeGroupIdList() {
        return this.nodeGroupIdList;
    }

    public ApplicationComponentDeploymentParam setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

}
