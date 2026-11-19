// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CancelOperationTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOperationTicketResponseBody body;

    public static CancelOperationTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationTicketResponse self = new CancelOperationTicketResponse();
        return TeaModel.build(map, self);
    }

    public CancelOperationTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOperationTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOperationTicketResponse setBody(CancelOperationTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOperationTicketResponseBody getBody() {
        return this.body;
    }

}
