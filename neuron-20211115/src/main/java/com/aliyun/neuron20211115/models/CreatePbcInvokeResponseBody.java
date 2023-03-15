// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeResponseBody extends TeaModel {
    @NameInMap("pbcInvokeId")
    public Long pbcInvokeId;

    @NameInMap("requestId")
    public String requestId;

    public static CreatePbcInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeResponseBody self = new CreatePbcInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeResponseBody setPbcInvokeId(Long pbcInvokeId) {
        this.pbcInvokeId = pbcInvokeId;
        return this;
    }
    public Long getPbcInvokeId() {
        return this.pbcInvokeId;
    }

    public CreatePbcInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
