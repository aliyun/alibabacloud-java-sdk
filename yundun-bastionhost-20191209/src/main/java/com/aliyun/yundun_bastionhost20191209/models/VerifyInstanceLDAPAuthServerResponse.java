// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceLDAPAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyInstanceLDAPAuthServerResponseBody body;

    public static VerifyInstanceLDAPAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceLDAPAuthServerResponse self = new VerifyInstanceLDAPAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceLDAPAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyInstanceLDAPAuthServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyInstanceLDAPAuthServerResponse setBody(VerifyInstanceLDAPAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyInstanceLDAPAuthServerResponseBody getBody() {
        return this.body;
    }

}
