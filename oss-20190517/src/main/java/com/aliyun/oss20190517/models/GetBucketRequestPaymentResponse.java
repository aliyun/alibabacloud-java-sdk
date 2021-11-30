// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketRequestPaymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketRequestPaymentResponseBody body;

    public static GetBucketRequestPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketRequestPaymentResponse self = new GetBucketRequestPaymentResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketRequestPaymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketRequestPaymentResponse setBody(GetBucketRequestPaymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketRequestPaymentResponseBody getBody() {
        return this.body;
    }

}
