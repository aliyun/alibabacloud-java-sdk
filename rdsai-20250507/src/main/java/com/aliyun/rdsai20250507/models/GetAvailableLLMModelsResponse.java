// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetAvailableLLMModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvailableLLMModelsResponseBody body;

    public static GetAvailableLLMModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableLLMModelsResponse self = new GetAvailableLLMModelsResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailableLLMModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailableLLMModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvailableLLMModelsResponse setBody(GetAvailableLLMModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailableLLMModelsResponseBody getBody() {
        return this.body;
    }

}
