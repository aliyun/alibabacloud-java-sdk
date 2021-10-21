// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ApplyNotaryPostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyNotaryPostResponseBody body;

    public static ApplyNotaryPostResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyNotaryPostResponse self = new ApplyNotaryPostResponse();
        return TeaModel.build(map, self);
    }

    public ApplyNotaryPostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyNotaryPostResponse setBody(ApplyNotaryPostResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyNotaryPostResponseBody getBody() {
        return this.body;
    }

}
