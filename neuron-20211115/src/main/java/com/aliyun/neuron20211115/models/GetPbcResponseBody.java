// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Pbc result;

    public static GetPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcResponseBody self = new GetPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcResponseBody setResult(Pbc result) {
        this.result = result;
        return this;
    }
    public Pbc getResult() {
        return this.result;
    }

}
