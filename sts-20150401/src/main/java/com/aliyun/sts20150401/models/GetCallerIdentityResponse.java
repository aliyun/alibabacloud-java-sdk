// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class GetCallerIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallerIdentityResponseBody body;

    public static GetCallerIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallerIdentityResponse self = new GetCallerIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetCallerIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallerIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallerIdentityResponse setBody(GetCallerIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallerIdentityResponseBody getBody() {
        return this.body;
    }

}
