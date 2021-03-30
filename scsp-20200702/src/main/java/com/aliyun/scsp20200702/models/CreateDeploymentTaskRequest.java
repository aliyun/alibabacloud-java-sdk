// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskRequest extends TeaModel {
    // 环境类型
    @NameInMap("EnvType")
    public String envType;

    // 部署code
    @NameInMap("DeploymentCode")
    public String deploymentCode;

    // 部署快照id
    @NameInMap("DeploymentArchiveId")
    public String deploymentArchiveId;

    // 应用快照id列表
    @NameInMap("AppArchiveIds")
    public java.util.List<String> appArchiveIds;

    public static CreateDeploymentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskRequest self = new CreateDeploymentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateDeploymentTaskRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public CreateDeploymentTaskRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

    public CreateDeploymentTaskRequest setAppArchiveIds(java.util.List<String> appArchiveIds) {
        this.appArchiveIds = appArchiveIds;
        return this;
    }
    public java.util.List<String> getAppArchiveIds() {
        return this.appArchiveIds;
    }

}
