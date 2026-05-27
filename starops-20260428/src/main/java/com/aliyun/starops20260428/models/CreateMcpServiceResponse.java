// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateMcpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcpServiceResponseBody body;

    public static CreateMcpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServiceResponse self = new CreateMcpServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcpServiceResponse setBody(CreateMcpServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcpServiceResponseBody getBody() {
        return this.body;
    }

}
