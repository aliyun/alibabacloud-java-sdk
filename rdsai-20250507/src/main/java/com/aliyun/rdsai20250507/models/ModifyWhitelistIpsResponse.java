// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyWhitelistIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWhitelistIpsResponseBody body;

    public static ModifyWhitelistIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhitelistIpsResponse self = new ModifyWhitelistIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWhitelistIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWhitelistIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWhitelistIpsResponse setBody(ModifyWhitelistIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWhitelistIpsResponseBody getBody() {
        return this.body;
    }

}
