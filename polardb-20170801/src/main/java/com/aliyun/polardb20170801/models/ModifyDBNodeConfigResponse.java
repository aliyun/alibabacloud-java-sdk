// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBNodeConfigResponseBody body;

    public static ModifyDBNodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeConfigResponse self = new ModifyDBNodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeConfigResponse setBody(ModifyDBNodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeConfigResponseBody getBody() {
        return this.body;
    }

}
