// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpServiceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpService result;

    public static UpdatePdpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpServiceResponseBody self = new UpdatePdpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePdpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePdpServiceResponseBody setResult(PdpService result) {
        this.result = result;
        return this;
    }
    public PdpService getResult() {
        return this.result;
    }

}
