// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpPbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpPbc result;

    public static CreatePdpPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpPbcResponseBody self = new CreatePdpPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePdpPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePdpPbcResponseBody setResult(PdpPbc result) {
        this.result = result;
        return this;
    }
    public PdpPbc getResult() {
        return this.result;
    }

}
