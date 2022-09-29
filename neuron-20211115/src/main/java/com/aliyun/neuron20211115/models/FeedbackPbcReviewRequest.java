// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackPbcReviewRequest extends TeaModel {
    @NameInMap("body")
    public FeedbackReviewCmd body;

    public static FeedbackPbcReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackPbcReviewRequest self = new FeedbackPbcReviewRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackPbcReviewRequest setBody(FeedbackReviewCmd body) {
        this.body = body;
        return this;
    }
    public FeedbackReviewCmd getBody() {
        return this.body;
    }

}
