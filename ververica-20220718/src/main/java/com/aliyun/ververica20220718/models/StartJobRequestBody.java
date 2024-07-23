// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobRequestBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5a19a71b-1c42-4f34-94fd-86cf60782c81</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("resourceSettingSpec")
    public BriefResourceSetting resourceSettingSpec;

    @NameInMap("restoreStrategy")
    public DeploymentRestoreStrategy restoreStrategy;

    public static StartJobRequestBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobRequestBody self = new StartJobRequestBody();
        return TeaModel.build(map, self);
    }

    public StartJobRequestBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public StartJobRequestBody setResourceSettingSpec(BriefResourceSetting resourceSettingSpec) {
        this.resourceSettingSpec = resourceSettingSpec;
        return this;
    }
    public BriefResourceSetting getResourceSettingSpec() {
        return this.resourceSettingSpec;
    }

    public StartJobRequestBody setRestoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

}
