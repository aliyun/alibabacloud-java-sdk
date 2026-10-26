// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyAiproEmbedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAiproEmbedConfigResponseBody body;

    public static ModifyAiproEmbedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiproEmbedConfigResponse self = new ModifyAiproEmbedConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAiproEmbedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAiproEmbedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAiproEmbedConfigResponse setBody(ModifyAiproEmbedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAiproEmbedConfigResponseBody getBody() {
        return this.body;
    }

}
