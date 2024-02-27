// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateTicketNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTicketNumResponseBody body;

    public static UpdateTicketNumResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketNumResponse self = new UpdateTicketNumResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTicketNumResponse setBody(UpdateTicketNumResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketNumResponseBody getBody() {
        return this.body;
    }

}
