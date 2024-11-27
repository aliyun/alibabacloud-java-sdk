// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateOperationTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOperationTicketResponseBody body;

    public static CreateOperationTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOperationTicketResponse self = new CreateOperationTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateOperationTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOperationTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOperationTicketResponse setBody(CreateOperationTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOperationTicketResponseBody getBody() {
        return this.body;
    }

}
