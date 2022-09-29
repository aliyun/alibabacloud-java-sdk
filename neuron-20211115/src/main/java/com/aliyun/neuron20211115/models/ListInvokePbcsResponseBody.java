// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListInvokePbcsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcListResult result;

    public static ListInvokePbcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvokePbcsResponseBody self = new ListInvokePbcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvokePbcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInvokePbcsResponseBody setResult(PbcListResult result) {
        this.result = result;
        return this;
    }
    public PbcListResult getResult() {
        return this.result;
    }

}
