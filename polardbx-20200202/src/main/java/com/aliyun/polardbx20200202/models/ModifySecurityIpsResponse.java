// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityIpsResponseBody body;

    public static ModifySecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsResponse self = new ModifySecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityIpsResponse setBody(ModifySecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityIpsResponseBody getBody() {
        return this.body;
    }

}
