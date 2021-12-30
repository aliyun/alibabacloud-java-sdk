// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceLDAPAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public VerifyInstanceLDAPAuthServerResponse setBody(VerifyInstanceLDAPAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyInstanceLDAPAuthServerResponseBody getBody() {
        return this.body;
    }

}
