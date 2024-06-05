// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchResponseBody body;

    public static BatchResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchResponse self = new BatchResponse();
        return TeaModel.build(map, self);
    }

    public BatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchResponse setBody(BatchResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchResponseBody getBody() {
        return this.body;
    }

}
