// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitBatchJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBatchJobsResponseBody body;

    public static SubmitBatchJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchJobsResponse self = new SubmitBatchJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBatchJobsResponse setBody(SubmitBatchJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchJobsResponseBody getBody() {
        return this.body;
    }

}
