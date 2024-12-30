// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthorizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmartqAuthorizeResponseBody body;

    public static SmartqAuthorizeResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartqAuthorizeResponse self = new SmartqAuthorizeResponse();
        return TeaModel.build(map, self);
    }

    public SmartqAuthorizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartqAuthorizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmartqAuthorizeResponse setBody(SmartqAuthorizeResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartqAuthorizeResponseBody getBody() {
        return this.body;
    }

}
