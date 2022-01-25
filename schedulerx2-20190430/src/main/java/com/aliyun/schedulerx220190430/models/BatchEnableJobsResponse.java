// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchEnableJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchEnableJobsResponse setBody(BatchEnableJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnableJobsResponseBody getBody() {
        return this.body;
    }

}
