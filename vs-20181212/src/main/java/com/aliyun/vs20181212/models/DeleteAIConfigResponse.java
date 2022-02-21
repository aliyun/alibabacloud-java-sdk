// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteAIConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAIConfigResponseBody body;

    public static DeleteAIConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIConfigResponse self = new DeleteAIConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIConfigResponse setBody(DeleteAIConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIConfigResponseBody getBody() {
        return this.body;
    }

}
