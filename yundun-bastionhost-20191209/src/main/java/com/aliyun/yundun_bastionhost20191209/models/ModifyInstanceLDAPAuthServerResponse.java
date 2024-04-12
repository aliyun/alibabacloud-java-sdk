// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceLDAPAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceLDAPAuthServerResponseBody body;

    public static ModifyInstanceLDAPAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceLDAPAuthServerResponse self = new ModifyInstanceLDAPAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceLDAPAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceLDAPAuthServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceLDAPAuthServerResponse setBody(ModifyInstanceLDAPAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceLDAPAuthServerResponseBody getBody() {
        return this.body;
    }

}
