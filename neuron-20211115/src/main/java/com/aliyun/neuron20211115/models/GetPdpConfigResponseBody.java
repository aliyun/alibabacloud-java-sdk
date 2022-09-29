// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpConfig result;

    public static GetPdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPdpConfigResponseBody self = new GetPdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPdpConfigResponseBody setResult(PdpConfig result) {
        this.result = result;
        return this;
    }
    public PdpConfig getResult() {
        return this.result;
    }

}
