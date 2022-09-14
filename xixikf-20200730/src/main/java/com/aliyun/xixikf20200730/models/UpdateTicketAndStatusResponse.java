// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateTicketAndStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTicketAndStatusResponseBody body;

    public static UpdateTicketAndStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketAndStatusResponse self = new UpdateTicketAndStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketAndStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketAndStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTicketAndStatusResponse setBody(UpdateTicketAndStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketAndStatusResponseBody getBody() {
        return this.body;
    }

}
