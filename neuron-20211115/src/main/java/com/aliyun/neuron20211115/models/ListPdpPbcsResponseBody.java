// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpPbcsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpPbcListResult result;

    public static ListPdpPbcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPdpPbcsResponseBody self = new ListPdpPbcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPdpPbcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPdpPbcsResponseBody setResult(PdpPbcListResult result) {
        this.result = result;
        return this;
    }
    public PdpPbcListResult getResult() {
        return this.result;
    }

}
