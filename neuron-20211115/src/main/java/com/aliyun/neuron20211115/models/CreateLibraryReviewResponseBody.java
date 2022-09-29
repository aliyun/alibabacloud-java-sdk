// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryReview result;

    public static CreateLibraryReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryReviewResponseBody self = new CreateLibraryReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLibraryReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLibraryReviewResponseBody setResult(LibraryReview result) {
        this.result = result;
        return this;
    }
    public LibraryReview getResult() {
        return this.result;
    }

}
