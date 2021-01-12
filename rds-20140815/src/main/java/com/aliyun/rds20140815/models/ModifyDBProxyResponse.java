// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBProxyResponse setBody(ModifyDBProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyResponseBody getBody() {
        return this.body;
    }

}
