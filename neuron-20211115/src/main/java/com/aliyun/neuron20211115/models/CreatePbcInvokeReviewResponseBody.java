// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreatePbcInvokeReviewResult result;

    public static CreatePbcInvokeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeReviewResponseBody self = new CreatePbcInvokeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePbcInvokeReviewResponseBody setResult(CreatePbcInvokeReviewResult result) {
        this.result = result;
        return this;
    }
    public CreatePbcInvokeReviewResult getResult() {
        return this.result;
    }

}
