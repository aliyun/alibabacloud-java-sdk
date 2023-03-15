// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeReviewResult extends TeaModel {
    @NameInMap("pbcInvokeReviewId")
    public Long pbcInvokeReviewId;

    @NameInMap("requestId")
    public String requestId;

    public static CreatePbcInvokeReviewResult build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeReviewResult self = new CreatePbcInvokeReviewResult();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeReviewResult setPbcInvokeReviewId(Long pbcInvokeReviewId) {
        this.pbcInvokeReviewId = pbcInvokeReviewId;
        return this;
    }
    public Long getPbcInvokeReviewId() {
        return this.pbcInvokeReviewId;
    }

    public CreatePbcInvokeReviewResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
