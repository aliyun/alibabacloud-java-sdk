// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectOperationTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectOperationTicketResponseBody body;

    public static RejectOperationTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectOperationTicketResponse self = new RejectOperationTicketResponse();
        return TeaModel.build(map, self);
    }

    public RejectOperationTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectOperationTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectOperationTicketResponse setBody(RejectOperationTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectOperationTicketResponseBody getBody() {
        return this.body;
    }

}
