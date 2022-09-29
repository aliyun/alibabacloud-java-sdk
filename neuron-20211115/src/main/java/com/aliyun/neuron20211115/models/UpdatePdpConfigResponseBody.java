// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpConfig result;

    public static UpdatePdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpConfigResponseBody self = new UpdatePdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePdpConfigResponseBody setResult(PdpConfig result) {
        this.result = result;
        return this;
    }
    public PdpConfig getResult() {
        return this.result;
    }

}
