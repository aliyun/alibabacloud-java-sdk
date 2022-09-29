// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Pbc result;

    public static CreatePbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcResponseBody self = new CreatePbcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePbcResponseBody setResult(Pbc result) {
        this.result = result;
        return this;
    }
    public Pbc getResult() {
        return this.result;
    }

}
