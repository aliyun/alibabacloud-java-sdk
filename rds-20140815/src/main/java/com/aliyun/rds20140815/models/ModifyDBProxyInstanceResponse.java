// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBProxyInstanceResponseBody body;

    public static ModifyDBProxyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceResponse self = new ModifyDBProxyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBProxyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBProxyInstanceResponse setBody(ModifyDBProxyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyInstanceResponseBody getBody() {
        return this.body;
    }

}
