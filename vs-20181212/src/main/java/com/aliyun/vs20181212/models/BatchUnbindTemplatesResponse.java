// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUnbindTemplatesResponseBody body;

    public static BatchUnbindTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplatesResponse self = new BatchUnbindTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUnbindTemplatesResponse setBody(BatchUnbindTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindTemplatesResponseBody getBody() {
        return this.body;
    }

}
