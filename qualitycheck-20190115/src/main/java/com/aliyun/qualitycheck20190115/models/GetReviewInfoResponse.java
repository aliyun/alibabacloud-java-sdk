// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetReviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReviewInfoResponseBody body;

    public static GetReviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReviewInfoResponse self = new GetReviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetReviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReviewInfoResponse setBody(GetReviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReviewInfoResponseBody getBody() {
        return this.body;
    }

}
