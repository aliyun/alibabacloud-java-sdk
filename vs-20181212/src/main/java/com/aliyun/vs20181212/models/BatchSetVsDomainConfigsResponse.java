// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchSetVsDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetVsDomainConfigsResponseBody body;

    public static BatchSetVsDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVsDomainConfigsResponse self = new BatchSetVsDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetVsDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetVsDomainConfigsResponse setBody(BatchSetVsDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
