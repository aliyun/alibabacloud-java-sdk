// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecommendTaskResponseBody body;

    public static CreateRecommendTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendTaskResponse self = new CreateRecommendTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecommendTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecommendTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecommendTaskResponse setBody(CreateRecommendTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecommendTaskResponseBody getBody() {
        return this.body;
    }

}
