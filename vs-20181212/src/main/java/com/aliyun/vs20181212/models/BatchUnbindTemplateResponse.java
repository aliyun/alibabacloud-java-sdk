// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchUnbindTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUnbindTemplateResponse setBody(BatchUnbindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindTemplateResponseBody getBody() {
        return this.body;
    }

}
