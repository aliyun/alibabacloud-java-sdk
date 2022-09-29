// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcInvokeReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcInvokeReview result;

    public static GetPbcInvokeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcInvokeReviewResponseBody self = new GetPbcInvokeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcInvokeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcInvokeReviewResponseBody setResult(PbcInvokeReview result) {
        this.result = result;
        return this;
    }
    public PbcInvokeReview getResult() {
        return this.result;
    }

}
