// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceSSLResponseBody body;

    public static ModifyInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSSLResponse self = new ModifyInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceSSLResponse setBody(ModifyInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
