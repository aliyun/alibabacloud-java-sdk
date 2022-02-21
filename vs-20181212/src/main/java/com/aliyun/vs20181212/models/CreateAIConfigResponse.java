// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateAIConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAIConfigResponseBody body;

    public static CreateAIConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIConfigResponse self = new CreateAIConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIConfigResponse setBody(CreateAIConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIConfigResponseBody getBody() {
        return this.body;
    }

}
