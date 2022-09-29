// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcSchema result;

    public static GetPbcSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcSchemaResponseBody self = new GetPbcSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcSchemaResponseBody setResult(PbcSchema result) {
        this.result = result;
        return this;
    }
    public PbcSchema getResult() {
        return this.result;
    }

}
