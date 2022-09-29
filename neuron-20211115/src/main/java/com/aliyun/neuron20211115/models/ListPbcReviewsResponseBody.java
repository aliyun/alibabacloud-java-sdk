// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcReviewsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcReviewListResult result;

    public static ListPbcReviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcReviewsResponseBody self = new ListPbcReviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcReviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcReviewsResponseBody setResult(PbcReviewListResult result) {
        this.result = result;
        return this;
    }
    public PbcReviewListResult getResult() {
        return this.result;
    }

}
