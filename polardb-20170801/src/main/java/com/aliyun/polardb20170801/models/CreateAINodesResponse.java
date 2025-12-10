// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAINodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAINodesResponseBody body;

    public static CreateAINodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAINodesResponse self = new CreateAINodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateAINodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAINodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAINodesResponse setBody(CreateAINodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAINodesResponseBody getBody() {
        return this.body;
    }

}
