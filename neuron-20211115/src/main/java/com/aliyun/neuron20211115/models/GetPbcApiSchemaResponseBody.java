// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcApiSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcApiSchema result;

    public static GetPbcApiSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcApiSchemaResponseBody self = new GetPbcApiSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcApiSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcApiSchemaResponseBody setResult(PbcApiSchema result) {
        this.result = result;
        return this;
    }
    public PbcApiSchema getResult() {
        return this.result;
    }

}
