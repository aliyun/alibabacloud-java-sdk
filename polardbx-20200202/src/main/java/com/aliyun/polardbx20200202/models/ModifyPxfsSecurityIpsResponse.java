// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyPxfsSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPxfsSecurityIpsResponseBody body;

    public static ModifyPxfsSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPxfsSecurityIpsResponse self = new ModifyPxfsSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPxfsSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPxfsSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPxfsSecurityIpsResponse setBody(ModifyPxfsSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPxfsSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
