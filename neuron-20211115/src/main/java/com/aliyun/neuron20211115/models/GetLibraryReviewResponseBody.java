// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryReview result;

    public static GetLibraryReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryReviewResponseBody self = new GetLibraryReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryReviewResponseBody setResult(LibraryReview result) {
        this.result = result;
        return this;
    }
    public LibraryReview getResult() {
        return this.result;
    }

}
