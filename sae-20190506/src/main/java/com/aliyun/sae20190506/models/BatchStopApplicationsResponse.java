// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopApplicationsResponseBody body;

    public static BatchStopApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsResponse self = new BatchStopApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopApplicationsResponse setBody(BatchStopApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopApplicationsResponseBody getBody() {
        return this.body;
    }

}
