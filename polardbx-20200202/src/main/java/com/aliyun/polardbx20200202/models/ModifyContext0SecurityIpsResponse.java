// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyContext0SecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyContext0SecurityIpsResponseBody body;

    public static ModifyContext0SecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContext0SecurityIpsResponse self = new ModifyContext0SecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContext0SecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContext0SecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContext0SecurityIpsResponse setBody(ModifyContext0SecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContext0SecurityIpsResponseBody getBody() {
        return this.body;
    }

}
