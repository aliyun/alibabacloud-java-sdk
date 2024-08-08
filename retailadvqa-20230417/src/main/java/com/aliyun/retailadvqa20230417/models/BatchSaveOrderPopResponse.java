// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class BatchSaveOrderPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSaveOrderPopResponseBody body;

    public static BatchSaveOrderPopResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveOrderPopResponse self = new BatchSaveOrderPopResponse();
        return TeaModel.build(map, self);
    }

    public BatchSaveOrderPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSaveOrderPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSaveOrderPopResponse setBody(BatchSaveOrderPopResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSaveOrderPopResponseBody getBody() {
        return this.body;
    }

}
