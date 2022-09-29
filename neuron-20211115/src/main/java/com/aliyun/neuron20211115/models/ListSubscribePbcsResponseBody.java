// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListSubscribePbcsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Pbc> result;

    public static ListSubscribePbcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribePbcsResponseBody self = new ListSubscribePbcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribePbcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribePbcsResponseBody setResult(java.util.List<Pbc> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Pbc> getResult() {
        return this.result;
    }

}
