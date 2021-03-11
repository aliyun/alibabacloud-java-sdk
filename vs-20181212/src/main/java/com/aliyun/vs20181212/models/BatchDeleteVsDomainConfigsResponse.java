// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchDeleteVsDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteVsDomainConfigsResponseBody body;

    public static BatchDeleteVsDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteVsDomainConfigsResponse self = new BatchDeleteVsDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteVsDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteVsDomainConfigsResponse setBody(BatchDeleteVsDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
