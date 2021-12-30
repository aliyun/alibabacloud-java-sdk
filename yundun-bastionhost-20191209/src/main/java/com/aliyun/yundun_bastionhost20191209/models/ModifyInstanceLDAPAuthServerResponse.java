// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceLDAPAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyInstanceLDAPAuthServerResponse setBody(ModifyInstanceLDAPAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceLDAPAuthServerResponseBody getBody() {
        return this.body;
    }

}
