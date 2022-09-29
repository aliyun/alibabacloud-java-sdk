// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcSchema result;

    public static CreatePbcSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcSchemaResponseBody self = new CreatePbcSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePbcSchemaResponseBody setResult(PbcSchema result) {
        this.result = result;
        return this;
    }
    public PbcSchema getResult() {
        return this.result;
    }

}
