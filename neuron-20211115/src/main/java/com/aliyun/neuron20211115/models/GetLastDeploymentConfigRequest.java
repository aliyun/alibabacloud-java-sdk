// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLastDeploymentConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static GetLastDeploymentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLastDeploymentConfigRequest self = new GetLastDeploymentConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLastDeploymentConfigRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
