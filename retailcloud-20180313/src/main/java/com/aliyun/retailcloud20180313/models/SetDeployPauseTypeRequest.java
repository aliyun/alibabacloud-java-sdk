// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SetDeployPauseTypeRequest extends TeaModel {
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    @NameInMap("DeployPauseType")
    public String deployPauseType;

    public static SetDeployPauseTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeployPauseTypeRequest self = new SetDeployPauseTypeRequest();
        return TeaModel.build(map, self);
    }

    public SetDeployPauseTypeRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public SetDeployPauseTypeRequest setDeployPauseType(String deployPauseType) {
        this.deployPauseType = deployPauseType;
        return this;
    }
    public String getDeployPauseType() {
        return this.deployPauseType;
    }

}
