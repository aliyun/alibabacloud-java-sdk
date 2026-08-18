// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyContextDBSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyContextDBSecurityIpsResponseBody body;

    public static ModifyContextDBSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContextDBSecurityIpsResponse self = new ModifyContextDBSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContextDBSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContextDBSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContextDBSecurityIpsResponse setBody(ModifyContextDBSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContextDBSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
