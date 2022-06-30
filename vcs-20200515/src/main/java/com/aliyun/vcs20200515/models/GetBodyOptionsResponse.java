// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetBodyOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBodyOptionsResponseBody body;

    public static GetBodyOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBodyOptionsResponse self = new GetBodyOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetBodyOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBodyOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBodyOptionsResponse setBody(GetBodyOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBodyOptionsResponseBody getBody() {
        return this.body;
    }

}
