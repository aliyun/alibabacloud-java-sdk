// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetStackDetailResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public StackDetailResult result;

    public static GetStackDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackDetailResponseBody self = new GetStackDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackDetailResponseBody setResult(StackDetailResult result) {
        this.result = result;
        return this;
    }
    public StackDetailResult getResult() {
        return this.result;
    }

}
