// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetCaCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCaCertResponseBody body;

    public static GetCaCertResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertResponse self = new GetCaCertResponse();
        return TeaModel.build(map, self);
    }

    public GetCaCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCaCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCaCertResponse setBody(GetCaCertResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCaCertResponseBody getBody() {
        return this.body;
    }

}
