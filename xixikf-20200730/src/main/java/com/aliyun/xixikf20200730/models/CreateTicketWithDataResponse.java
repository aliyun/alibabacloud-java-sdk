// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateTicketWithDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketWithDataResponseBody body;

    public static CreateTicketWithDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithDataResponse self = new CreateTicketWithDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketWithDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTicketWithDataResponse setBody(CreateTicketWithDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketWithDataResponseBody getBody() {
        return this.body;
    }

}
