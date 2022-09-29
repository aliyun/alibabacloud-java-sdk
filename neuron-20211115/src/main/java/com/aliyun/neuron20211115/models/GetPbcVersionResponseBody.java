// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcVersion result;

    public static GetPbcVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcVersionResponseBody self = new GetPbcVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcVersionResponseBody setResult(PbcVersion result) {
        this.result = result;
        return this;
    }
    public PbcVersion getResult() {
        return this.result;
    }

}
