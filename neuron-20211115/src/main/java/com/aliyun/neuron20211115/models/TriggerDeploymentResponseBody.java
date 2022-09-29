// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TriggerDeploymentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpServiceDeployment result;

    public static TriggerDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerDeploymentResponseBody self = new TriggerDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerDeploymentResponseBody setResult(PdpServiceDeployment result) {
        this.result = result;
        return this;
    }
    public PdpServiceDeployment getResult() {
        return this.result;
    }

}
