// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationPromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationPromptResponseBody body;

    public static CreateApplicationPromptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationPromptResponse self = new CreateApplicationPromptResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationPromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationPromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationPromptResponse setBody(CreateApplicationPromptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationPromptResponseBody getBody() {
        return this.body;
    }

}
