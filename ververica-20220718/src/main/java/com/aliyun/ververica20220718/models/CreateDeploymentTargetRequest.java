// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentTargetRequest extends TeaModel {
    @NameInMap("body")
    public ResourceSpec body;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dt</p>
     */
    @NameInMap("deploymentTargetName")
    public String deploymentTargetName;

    public static CreateDeploymentTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTargetRequest self = new CreateDeploymentTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTargetRequest setBody(ResourceSpec body) {
        this.body = body;
        return this;
    }
    public ResourceSpec getBody() {
        return this.body;
    }

    public CreateDeploymentTargetRequest setDeploymentTargetName(String deploymentTargetName) {
        this.deploymentTargetName = deploymentTargetName;
        return this;
    }
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

}
