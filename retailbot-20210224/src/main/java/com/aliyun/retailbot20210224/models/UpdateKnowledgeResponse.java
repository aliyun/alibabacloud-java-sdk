// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateKnowledgeResponseBody body;

    public static UpdateKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeResponse self = new UpdateKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeResponse setBody(UpdateKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeResponseBody getBody() {
        return this.body;
    }

}
