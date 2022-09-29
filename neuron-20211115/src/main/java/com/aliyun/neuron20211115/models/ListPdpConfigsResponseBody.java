// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpConfigsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpConfigPageResult result;

    public static ListPdpConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPdpConfigsResponseBody self = new ListPdpConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPdpConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPdpConfigsResponseBody setResult(PdpConfigPageResult result) {
        this.result = result;
        return this;
    }
    public PdpConfigPageResult getResult() {
        return this.result;
    }

}
