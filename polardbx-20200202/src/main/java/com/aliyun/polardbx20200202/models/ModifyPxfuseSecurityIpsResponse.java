// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyPxfuseSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPxfuseSecurityIpsResponseBody body;

    public static ModifyPxfuseSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPxfuseSecurityIpsResponse self = new ModifyPxfuseSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPxfuseSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPxfuseSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPxfuseSecurityIpsResponse setBody(ModifyPxfuseSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPxfuseSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
