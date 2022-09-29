// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeployDetailInfo result;

    public static GetDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponseBody self = new GetDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentResponseBody setResult(DeployDetailInfo result) {
        this.result = result;
        return this;
    }
    public DeployDetailInfo getResult() {
        return this.result;
    }

}
