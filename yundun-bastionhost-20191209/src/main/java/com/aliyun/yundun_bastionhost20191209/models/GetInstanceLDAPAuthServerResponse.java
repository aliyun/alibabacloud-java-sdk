// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceLDAPAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceLDAPAuthServerResponseBody body;

    public static GetInstanceLDAPAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLDAPAuthServerResponse self = new GetInstanceLDAPAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceLDAPAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceLDAPAuthServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceLDAPAuthServerResponse setBody(GetInstanceLDAPAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceLDAPAuthServerResponseBody getBody() {
        return this.body;
    }

}
