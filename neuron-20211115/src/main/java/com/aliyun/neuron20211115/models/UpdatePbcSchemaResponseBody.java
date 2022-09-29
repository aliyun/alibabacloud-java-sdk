// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcSchema result;

    public static UpdatePbcSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcSchemaResponseBody self = new UpdatePbcSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePbcSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePbcSchemaResponseBody setResult(PbcSchema result) {
        this.result = result;
        return this;
    }
    public PbcSchema getResult() {
        return this.result;
    }

}
