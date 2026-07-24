// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteDeploymentByNameRequest extends TeaModel {
    /**
     * <p>The name of the deployed job, which is typically specified by the user when submitting the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    public static DeleteDeploymentByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentByNameRequest self = new DeleteDeploymentByNameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentByNameRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

}
