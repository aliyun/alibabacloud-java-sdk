// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindDirectoriesResponseBody body;

    public static BatchUnbindDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDirectoriesResponse self = new BatchUnbindDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindDirectoriesResponse setBody(BatchUnbindDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindDirectoriesResponseBody getBody() {
        return this.body;
    }

}
