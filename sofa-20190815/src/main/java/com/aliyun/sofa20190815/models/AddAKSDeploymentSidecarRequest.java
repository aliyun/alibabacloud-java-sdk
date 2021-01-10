// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSDeploymentSidecarRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DeployTemplate")
    public String deployTemplate;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("SidecarParams")
    public java.util.List<AddAKSDeploymentSidecarRequestSidecarParams> sidecarParams;

    public static AddAKSDeploymentSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAKSDeploymentSidecarRequest self = new AddAKSDeploymentSidecarRequest();
        return TeaModel.build(map, self);
    }

    public AddAKSDeploymentSidecarRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddAKSDeploymentSidecarRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AddAKSDeploymentSidecarRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddAKSDeploymentSidecarRequest setDeployTemplate(String deployTemplate) {
        this.deployTemplate = deployTemplate;
        return this;
    }
    public String getDeployTemplate() {
        return this.deployTemplate;
    }

    public AddAKSDeploymentSidecarRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public AddAKSDeploymentSidecarRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AddAKSDeploymentSidecarRequest setSidecarParams(java.util.List<AddAKSDeploymentSidecarRequestSidecarParams> sidecarParams) {
        this.sidecarParams = sidecarParams;
        return this;
    }
    public java.util.List<AddAKSDeploymentSidecarRequestSidecarParams> getSidecarParams() {
        return this.sidecarParams;
    }

    public static class AddAKSDeploymentSidecarRequestSidecarParams extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AddAKSDeploymentSidecarRequestSidecarParams build(java.util.Map<String, ?> map) throws Exception {
            AddAKSDeploymentSidecarRequestSidecarParams self = new AddAKSDeploymentSidecarRequestSidecarParams();
            return TeaModel.build(map, self);
        }

        public AddAKSDeploymentSidecarRequestSidecarParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAKSDeploymentSidecarRequestSidecarParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
