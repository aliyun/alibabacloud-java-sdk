// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcListResult result;

    public static ListPbcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcsResponseBody self = new ListPbcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcsResponseBody setResult(PbcListResult result) {
        this.result = result;
        return this;
    }
    public PbcListResult getResult() {
        return this.result;
    }

}
