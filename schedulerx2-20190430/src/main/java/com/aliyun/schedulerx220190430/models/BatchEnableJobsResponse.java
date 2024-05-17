// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchEnableJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchEnableJobsResponseBody body;

    public static BatchEnableJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableJobsResponse self = new BatchEnableJobsResponse();
        return TeaModel.build(map, self);
    }

    public BatchEnableJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEnableJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEnableJobsResponse setBody(BatchEnableJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnableJobsResponseBody getBody() {
        return this.body;
    }

}
