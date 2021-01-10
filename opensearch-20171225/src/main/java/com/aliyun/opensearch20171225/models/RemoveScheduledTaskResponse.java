// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveScheduledTaskResponseBody body;

    public static RemoveScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveScheduledTaskResponse self = new RemoveScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveScheduledTaskResponse setBody(RemoveScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
