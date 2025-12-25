// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReopenTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReopenTicketResponseBody body;

    public static ReopenTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenTicketResponse self = new ReopenTicketResponse();
        return TeaModel.build(map, self);
    }

    public ReopenTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReopenTicketResponse setBody(ReopenTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenTicketResponseBody getBody() {
        return this.body;
    }

}
