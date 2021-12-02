// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ResumeDeployRequest extends TeaModel {
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    public static ResumeDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeDeployRequest self = new ResumeDeployRequest();
        return TeaModel.build(map, self);
    }

    public ResumeDeployRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

}
