// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationAgentRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationAgentRelationResponseBody body;

    public static CreateApplicationAgentRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAgentRelationResponse self = new CreateApplicationAgentRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAgentRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationAgentRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationAgentRelationResponse setBody(CreateApplicationAgentRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationAgentRelationResponseBody getBody() {
        return this.body;
    }

}
