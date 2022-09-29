// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpServiceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpService result;

    public static GetPdpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPdpServiceResponseBody self = new GetPdpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPdpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPdpServiceResponseBody setResult(PdpService result) {
        this.result = result;
        return this;
    }
    public PdpService getResult() {
        return this.result;
    }

}
