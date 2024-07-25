// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateAITaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAITaskResponseBody body;

    public static CreateAITaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAITaskResponse self = new CreateAITaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAITaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAITaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAITaskResponse setBody(CreateAITaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAITaskResponseBody getBody() {
        return this.body;
    }

}
