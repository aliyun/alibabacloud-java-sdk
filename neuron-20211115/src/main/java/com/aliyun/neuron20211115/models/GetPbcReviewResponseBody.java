// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcReview result;

    public static GetPbcReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcReviewResponseBody self = new GetPbcReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcReviewResponseBody setResult(PbcReview result) {
        this.result = result;
        return this;
    }
    public PbcReview getResult() {
        return this.result;
    }

}
