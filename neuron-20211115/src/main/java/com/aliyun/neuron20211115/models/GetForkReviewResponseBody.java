// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetForkReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ForkReview result;

    public static GetForkReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetForkReviewResponseBody self = new GetForkReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetForkReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetForkReviewResponseBody setResult(ForkReview result) {
        this.result = result;
        return this;
    }
    public ForkReview getResult() {
        return this.result;
    }

}
