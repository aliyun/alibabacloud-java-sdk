// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentByNameRequest extends TeaModel {
    /**
     * <p>The collection of fields to update. Partial updates are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public Deployment body;

    /**
     * <p>The deployment job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    public static UpdateDeploymentByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentByNameRequest self = new UpdateDeploymentByNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentByNameRequest setBody(Deployment body) {
        this.body = body;
        return this;
    }
    public Deployment getBody() {
        return this.body;
    }

    public UpdateDeploymentByNameRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

}
