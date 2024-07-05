// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchSetVsDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchSetVsDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetVsDomainConfigsResponse setBody(BatchSetVsDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
