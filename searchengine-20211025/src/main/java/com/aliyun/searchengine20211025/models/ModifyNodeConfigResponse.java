// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyNodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNodeConfigResponseBody body;

    public static ModifyNodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeConfigResponse self = new ModifyNodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodeConfigResponse setBody(ModifyNodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodeConfigResponseBody getBody() {
        return this.body;
    }

}
