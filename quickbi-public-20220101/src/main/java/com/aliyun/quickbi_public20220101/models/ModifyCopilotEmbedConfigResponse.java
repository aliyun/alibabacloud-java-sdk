// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyCopilotEmbedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCopilotEmbedConfigResponseBody body;

    public static ModifyCopilotEmbedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCopilotEmbedConfigResponse self = new ModifyCopilotEmbedConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCopilotEmbedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCopilotEmbedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCopilotEmbedConfigResponse setBody(ModifyCopilotEmbedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCopilotEmbedConfigResponseBody getBody() {
        return this.body;
    }

}
