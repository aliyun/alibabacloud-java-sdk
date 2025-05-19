// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLLMConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLLMConfigResponseBody body;

    public static CreateLLMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLLMConfigResponse self = new CreateLLMConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLLMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLLMConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLLMConfigResponse setBody(CreateLLMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLLMConfigResponseBody getBody() {
        return this.body;
    }

}
