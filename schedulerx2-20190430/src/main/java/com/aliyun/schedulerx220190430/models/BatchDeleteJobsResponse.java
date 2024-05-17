// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteJobsResponseBody body;

    public static BatchDeleteJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteJobsResponse self = new BatchDeleteJobsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteJobsResponse setBody(BatchDeleteJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteJobsResponseBody getBody() {
        return this.body;
    }

}
