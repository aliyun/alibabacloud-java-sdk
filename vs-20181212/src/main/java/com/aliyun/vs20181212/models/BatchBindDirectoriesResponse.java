// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchBindDirectoriesResponseBody body;

    public static BatchBindDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDirectoriesResponse self = new BatchBindDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindDirectoriesResponse setBody(BatchBindDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindDirectoriesResponseBody getBody() {
        return this.body;
    }

}
