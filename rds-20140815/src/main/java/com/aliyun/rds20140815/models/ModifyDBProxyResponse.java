// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBProxyResponseBody body;

    public static ModifyDBProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyResponse self = new ModifyDBProxyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBProxyResponse setBody(ModifyDBProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyResponseBody getBody() {
        return this.body;
    }

}
