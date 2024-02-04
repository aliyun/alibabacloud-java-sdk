// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ApplyNotaryPostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ApplyNotaryPostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyNotaryPostResponse setBody(ApplyNotaryPostResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyNotaryPostResponseBody getBody() {
        return this.body;
    }

}
