// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchBindTemplateResponseBody body;

    public static BatchBindTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplateResponse self = new BatchBindTemplateResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindTemplateResponse setBody(BatchBindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindTemplateResponseBody getBody() {
        return this.body;
    }

}
