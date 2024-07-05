// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchBindTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindTemplateResponse setBody(BatchBindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindTemplateResponseBody getBody() {
        return this.body;
    }

}
