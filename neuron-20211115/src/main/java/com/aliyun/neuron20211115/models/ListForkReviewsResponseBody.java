// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListForkReviewsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ForkReviewListResult result;

    public static ListForkReviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForkReviewsResponseBody self = new ListForkReviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListForkReviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListForkReviewsResponseBody setResult(ForkReviewListResult result) {
        this.result = result;
        return this;
    }
    public ForkReviewListResult getResult() {
        return this.result;
    }

}
