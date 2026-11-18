// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationSSLResponseBody body;

    public static ModifyApplicationSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSSLResponse self = new ModifyApplicationSSLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationSSLResponse setBody(ModifyApplicationSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationSSLResponseBody getBody() {
        return this.body;
    }

}
