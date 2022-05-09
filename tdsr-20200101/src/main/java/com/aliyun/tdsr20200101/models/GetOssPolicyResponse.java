// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetOssPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssPolicyResponseBody body;

    public static GetOssPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssPolicyResponse self = new GetOssPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetOssPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssPolicyResponse setBody(GetOssPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssPolicyResponseBody getBody() {
        return this.body;
    }

}
