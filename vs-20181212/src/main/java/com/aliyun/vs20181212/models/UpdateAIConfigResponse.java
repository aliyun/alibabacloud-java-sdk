// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateAIConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAIConfigResponseBody body;

    public static UpdateAIConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIConfigResponse self = new UpdateAIConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAIConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAIConfigResponse setBody(UpdateAIConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAIConfigResponseBody getBody() {
        return this.body;
    }

}
