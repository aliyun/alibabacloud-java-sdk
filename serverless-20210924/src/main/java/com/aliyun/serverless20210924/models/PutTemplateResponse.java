// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Template body;

    public static PutTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PutTemplateResponse self = new PutTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PutTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutTemplateResponse setBody(Template body) {
        this.body = body;
        return this;
    }
    public Template getBody() {
        return this.body;
    }

}
