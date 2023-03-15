// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLastDeploymentConfigRequest extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("serviceId")
    public Long serviceId;

    public static GetLastDeploymentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLastDeploymentConfigRequest self = new GetLastDeploymentConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLastDeploymentConfigRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetLastDeploymentConfigRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
