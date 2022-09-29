// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLastDeploymentConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeployConfigInfo result;

    public static GetLastDeploymentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLastDeploymentConfigResponseBody self = new GetLastDeploymentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLastDeploymentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLastDeploymentConfigResponseBody setResult(DeployConfigInfo result) {
        this.result = result;
        return this;
    }
    public DeployConfigInfo getResult() {
        return this.result;
    }

}
