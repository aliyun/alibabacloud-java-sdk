// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptOperationTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptOperationTicketResponseBody body;

    public static AcceptOperationTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptOperationTicketResponse self = new AcceptOperationTicketResponse();
        return TeaModel.build(map, self);
    }

    public AcceptOperationTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptOperationTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptOperationTicketResponse setBody(AcceptOperationTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptOperationTicketResponseBody getBody() {
        return this.body;
    }

}
