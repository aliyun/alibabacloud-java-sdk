// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcApiSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcApiSchema result;

    public static UpdatePbcApiSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcApiSchemaResponseBody self = new UpdatePbcApiSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePbcApiSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePbcApiSchemaResponseBody setResult(PbcApiSchema result) {
        this.result = result;
        return this;
    }
    public PbcApiSchema getResult() {
        return this.result;
    }

}
