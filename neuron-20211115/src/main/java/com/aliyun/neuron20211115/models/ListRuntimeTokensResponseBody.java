// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRuntimeTokensResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpListTokenResult result;

    public static ListRuntimeTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimeTokensResponseBody self = new ListRuntimeTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuntimeTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuntimeTokensResponseBody setResult(PdpListTokenResult result) {
        this.result = result;
        return this;
    }
    public PdpListTokenResult getResult() {
        return this.result;
    }

}
