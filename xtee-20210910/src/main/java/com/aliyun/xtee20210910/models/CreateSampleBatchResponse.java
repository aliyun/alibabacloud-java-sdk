// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleBatchResponseBody body;

    public static CreateSampleBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleBatchResponse self = new CreateSampleBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleBatchResponse setBody(CreateSampleBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleBatchResponseBody getBody() {
        return this.body;
    }

}
