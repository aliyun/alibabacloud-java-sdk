// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateTicketWithStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketWithStatusResponseBody body;

    public static CreateTicketWithStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithStatusResponse self = new CreateTicketWithStatusResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketWithStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTicketWithStatusResponse setBody(CreateTicketWithStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketWithStatusResponseBody getBody() {
        return this.body;
    }

}
