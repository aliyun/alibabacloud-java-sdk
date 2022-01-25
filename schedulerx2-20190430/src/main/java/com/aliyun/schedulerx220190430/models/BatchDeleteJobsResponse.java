// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchDeleteJobsResponse setBody(BatchDeleteJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteJobsResponseBody getBody() {
        return this.body;
    }

}
