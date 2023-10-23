// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketResponseBody body;

    public static CreateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketResponse self = new CreateTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTicketResponse setBody(CreateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketResponseBody getBody() {
        return this.body;
    }

}
