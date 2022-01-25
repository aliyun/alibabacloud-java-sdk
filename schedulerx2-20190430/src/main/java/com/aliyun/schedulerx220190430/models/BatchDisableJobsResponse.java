// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDisableJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDisableJobsResponseBody body;

    public static BatchDisableJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableJobsResponse self = new BatchDisableJobsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDisableJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDisableJobsResponse setBody(BatchDisableJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDisableJobsResponseBody getBody() {
        return this.body;
    }

}
