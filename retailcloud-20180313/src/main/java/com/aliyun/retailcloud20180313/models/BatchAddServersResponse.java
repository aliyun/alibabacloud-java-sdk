// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BatchAddServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddServersResponseBody body;

    public static BatchAddServersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddServersResponse self = new BatchAddServersResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddServersResponse setBody(BatchAddServersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddServersResponseBody getBody() {
        return this.body;
    }

}
