// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDbProxyInstanceSslResponseBody body;

    public static ModifyDbProxyInstanceSslResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslResponse self = new ModifyDbProxyInstanceSslResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDbProxyInstanceSslResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDbProxyInstanceSslResponse setBody(ModifyDbProxyInstanceSslResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

}
