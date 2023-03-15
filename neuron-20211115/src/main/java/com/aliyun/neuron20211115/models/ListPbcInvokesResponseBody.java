// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcListResult result;

    public static ListPbcInvokesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcInvokesResponseBody self = new ListPbcInvokesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcInvokesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcInvokesResponseBody setResult(PbcListResult result) {
        this.result = result;
        return this;
    }
    public PbcListResult getResult() {
        return this.result;
    }

}
