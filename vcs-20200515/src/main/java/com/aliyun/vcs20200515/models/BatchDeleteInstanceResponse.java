// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BatchDeleteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteInstanceResponseBody body;

    public static BatchDeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteInstanceResponse self = new BatchDeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteInstanceResponse setBody(BatchDeleteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteInstanceResponseBody getBody() {
        return this.body;
    }

}
