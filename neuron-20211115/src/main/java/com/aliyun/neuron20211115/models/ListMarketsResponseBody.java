// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMarketsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Market> result;

    public static ListMarketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMarketsResponseBody self = new ListMarketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMarketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMarketsResponseBody setResult(java.util.List<Market> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Market> getResult() {
        return this.result;
    }

}
