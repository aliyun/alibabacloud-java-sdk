// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDbProxyInstanceSslResponse setBody(ModifyDbProxyInstanceSslResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

}
