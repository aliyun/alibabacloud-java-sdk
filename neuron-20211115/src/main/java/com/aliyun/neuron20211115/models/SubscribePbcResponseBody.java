// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SubscribePbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Pbc> result;

    public static SubscribePbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubscribePbcResponseBody self = new SubscribePbcResponseBody();
        return TeaModel.build(map, self);
    }

    public SubscribePbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubscribePbcResponseBody setResult(java.util.List<Pbc> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Pbc> getResult() {
        return this.result;
    }

}
