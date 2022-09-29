// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokeReviewsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<PbcInvokeReview> result;

    public static ListPbcInvokeReviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcInvokeReviewsResponseBody self = new ListPbcInvokeReviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcInvokeReviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcInvokeReviewsResponseBody setResult(java.util.List<PbcInvokeReview> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PbcInvokeReview> getResult() {
        return this.result;
    }

}
