// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateAgentResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentResourceResponseBody body;

    public static CreateAgentResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResourceResponse self = new CreateAgentResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentResourceResponse setBody(CreateAgentResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentResourceResponseBody getBody() {
        return this.body;
    }

}
