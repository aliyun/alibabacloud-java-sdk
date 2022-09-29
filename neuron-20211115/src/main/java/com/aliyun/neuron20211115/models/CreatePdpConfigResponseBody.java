// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpConfig result;

    public static CreatePdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpConfigResponseBody self = new CreatePdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePdpConfigResponseBody setResult(PdpConfig result) {
        this.result = result;
        return this;
    }
    public PdpConfig getResult() {
        return this.result;
    }

}
