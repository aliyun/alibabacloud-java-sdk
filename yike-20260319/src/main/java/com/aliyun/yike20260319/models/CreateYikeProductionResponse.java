// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYikeProductionResponseBody body;

    public static CreateYikeProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeProductionResponse self = new CreateYikeProductionResponse();
        return TeaModel.build(map, self);
    }

    public CreateYikeProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYikeProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYikeProductionResponse setBody(CreateYikeProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYikeProductionResponseBody getBody() {
        return this.body;
    }

}
