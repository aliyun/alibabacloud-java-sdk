// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4AiProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTicket4AiProResponseBody body;

    public static CreateTicket4AiProResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicket4AiProResponse self = new CreateTicket4AiProResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicket4AiProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicket4AiProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTicket4AiProResponse setBody(CreateTicket4AiProResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicket4AiProResponseBody getBody() {
        return this.body;
    }

}
