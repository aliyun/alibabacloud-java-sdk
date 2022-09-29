// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RollbackPdpServiceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpServiceDeployment result;

    public static RollbackPdpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackPdpServiceResponseBody self = new RollbackPdpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackPdpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackPdpServiceResponseBody setResult(PdpServiceDeployment result) {
        this.result = result;
        return this;
    }
    public PdpServiceDeployment getResult() {
        return this.result;
    }

}
