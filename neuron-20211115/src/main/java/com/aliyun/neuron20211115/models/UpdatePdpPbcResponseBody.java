// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpPbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpPbc result;

    public static UpdatePdpPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpPbcResponseBody self = new UpdatePdpPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePdpPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePdpPbcResponseBody setResult(PdpPbc result) {
        this.result = result;
        return this;
    }
    public PdpPbc getResult() {
        return this.result;
    }

}
