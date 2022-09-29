// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpDeploymentPageResult result;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeploymentsResponseBody setResult(PdpDeploymentPageResult result) {
        this.result = result;
        return this;
    }
    public PdpDeploymentPageResult getResult() {
        return this.result;
    }

}
