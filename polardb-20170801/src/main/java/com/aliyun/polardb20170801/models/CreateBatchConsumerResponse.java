// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBatchConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchConsumerResponseBody body;

    public static CreateBatchConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchConsumerResponse self = new CreateBatchConsumerResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchConsumerResponse setBody(CreateBatchConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchConsumerResponseBody getBody() {
        return this.body;
    }

}
