// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployModeDependency extends TeaModel {
    // dependApplications
    @NameInMap("dependApplications")
    public java.util.List<String> dependApplications;

    // dependConfigs
    @NameInMap("dependConfigs")
    public java.util.List<DependConfig> dependConfigs;

    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    public static DeployModeDependency build(java.util.Map<String, ?> map) throws Exception {
        DeployModeDependency self = new DeployModeDependency();
        return TeaModel.build(map, self);
    }

    public DeployModeDependency setDependApplications(java.util.List<String> dependApplications) {
        this.dependApplications = dependApplications;
        return this;
    }
    public java.util.List<String> getDependApplications() {
        return this.dependApplications;
    }

    public DeployModeDependency setDependConfigs(java.util.List<DependConfig> dependConfigs) {
        this.dependConfigs = dependConfigs;
        return this;
    }
    public java.util.List<DependConfig> getDependConfigs() {
        return this.dependConfigs;
    }

    public DeployModeDependency setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

}
