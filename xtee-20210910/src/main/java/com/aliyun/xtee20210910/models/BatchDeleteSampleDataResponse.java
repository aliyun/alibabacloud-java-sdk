// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class BatchDeleteSampleDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteSampleDataResponseBody body;

    public static BatchDeleteSampleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSampleDataResponse self = new BatchDeleteSampleDataResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSampleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteSampleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteSampleDataResponse setBody(BatchDeleteSampleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteSampleDataResponseBody getBody() {
        return this.body;
    }

}
