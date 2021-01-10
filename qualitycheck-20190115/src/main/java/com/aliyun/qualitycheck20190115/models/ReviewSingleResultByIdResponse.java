// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ReviewSingleResultByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReviewSingleResultByIdResponseBody body;

    public static ReviewSingleResultByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ReviewSingleResultByIdResponse self = new ReviewSingleResultByIdResponse();
        return TeaModel.build(map, self);
    }

    public ReviewSingleResultByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReviewSingleResultByIdResponse setBody(ReviewSingleResultByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ReviewSingleResultByIdResponseBody getBody() {
        return this.body;
    }

}
