// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateTicketAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTicketAllResponseBody body;

    public static UpdateTicketAllResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketAllResponse self = new UpdateTicketAllResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTicketAllResponse setBody(UpdateTicketAllResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketAllResponseBody getBody() {
        return this.body;
    }

}
