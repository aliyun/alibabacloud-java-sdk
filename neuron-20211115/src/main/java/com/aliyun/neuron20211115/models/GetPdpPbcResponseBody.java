// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpPbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpPbc result;

    public static GetPdpPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPdpPbcResponseBody self = new GetPdpPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPdpPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPdpPbcResponseBody setResult(PdpPbc result) {
        this.result = result;
        return this;
    }
    public PdpPbc getResult() {
        return this.result;
    }

}
