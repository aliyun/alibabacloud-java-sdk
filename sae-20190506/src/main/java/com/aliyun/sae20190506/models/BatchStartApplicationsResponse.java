// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStartApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStartApplicationsResponseBody body;

    public static BatchStartApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartApplicationsResponse self = new BatchStartApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartApplicationsResponse setBody(BatchStartApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartApplicationsResponseBody getBody() {
        return this.body;
    }

}
