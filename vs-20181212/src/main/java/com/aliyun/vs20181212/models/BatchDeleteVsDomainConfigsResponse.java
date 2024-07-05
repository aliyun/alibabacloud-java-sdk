// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchDeleteVsDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchDeleteVsDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteVsDomainConfigsResponse setBody(BatchDeleteVsDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
