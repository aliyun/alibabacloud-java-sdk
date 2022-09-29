// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ContinueDeploymentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpServiceDeployment result;

    public static ContinueDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeploymentResponseBody self = new ContinueDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContinueDeploymentResponseBody setResult(PdpServiceDeployment result) {
        this.result = result;
        return this;
    }
    public PdpServiceDeployment getResult() {
        return this.result;
    }

}
