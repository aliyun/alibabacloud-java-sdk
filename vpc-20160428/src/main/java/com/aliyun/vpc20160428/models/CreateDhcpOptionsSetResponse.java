// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDhcpOptionsSetResponseBody body;

    public static CreateDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDhcpOptionsSetResponse self = new CreateDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDhcpOptionsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDhcpOptionsSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDhcpOptionsSetResponse setBody(CreateDhcpOptionsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

}
