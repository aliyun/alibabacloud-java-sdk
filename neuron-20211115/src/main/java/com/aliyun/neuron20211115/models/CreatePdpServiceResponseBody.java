// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpServiceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpService result;

    public static CreatePdpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpServiceResponseBody self = new CreatePdpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePdpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePdpServiceResponseBody setResult(PdpService result) {
        this.result = result;
        return this;
    }
    public PdpService getResult() {
        return this.result;
    }

}
