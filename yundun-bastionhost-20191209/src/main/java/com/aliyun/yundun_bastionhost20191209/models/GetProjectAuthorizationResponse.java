// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectAuthorizationResponseBody body;

    public static GetProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectAuthorizationResponse self = new GetProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectAuthorizationResponse setBody(GetProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
