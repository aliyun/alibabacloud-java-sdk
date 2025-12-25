// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplyTicketResponseBody body;

    public static ReplyTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplyTicketResponse self = new ReplyTicketResponse();
        return TeaModel.build(map, self);
    }

    public ReplyTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplyTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplyTicketResponse setBody(ReplyTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplyTicketResponseBody getBody() {
        return this.body;
    }

}
