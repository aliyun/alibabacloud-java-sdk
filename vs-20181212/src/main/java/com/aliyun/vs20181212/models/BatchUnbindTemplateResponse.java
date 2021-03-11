// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindTemplateResponseBody body;

    public static BatchUnbindTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplateResponse self = new BatchUnbindTemplateResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindTemplateResponse setBody(BatchUnbindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindTemplateResponseBody getBody() {
        return this.body;
    }

}
