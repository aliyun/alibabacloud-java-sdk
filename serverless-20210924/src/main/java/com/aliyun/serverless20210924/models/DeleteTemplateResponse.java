// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class DeleteTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Status body;

    public static DeleteTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateResponse self = new DeleteTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateResponse setBody(Status body) {
        this.body = body;
        return this;
    }
    public Status getBody() {
        return this.body;
    }

}
