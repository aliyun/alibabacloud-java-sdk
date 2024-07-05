// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchBindTemplatesResponseBody body;

    public static BatchBindTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplatesResponse self = new BatchBindTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindTemplatesResponse setBody(BatchBindTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindTemplatesResponseBody getBody() {
        return this.body;
    }

}
