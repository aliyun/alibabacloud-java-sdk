// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
