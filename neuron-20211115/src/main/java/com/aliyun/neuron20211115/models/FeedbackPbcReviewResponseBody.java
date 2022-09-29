// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackPbcReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcReview result;

    public static FeedbackPbcReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackPbcReviewResponseBody self = new FeedbackPbcReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackPbcReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FeedbackPbcReviewResponseBody setResult(PbcReview result) {
        this.result = result;
        return this;
    }
    public PbcReview getResult() {
        return this.result;
    }

}
