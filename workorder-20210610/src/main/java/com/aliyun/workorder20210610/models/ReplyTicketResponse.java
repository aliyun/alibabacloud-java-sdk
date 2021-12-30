// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ReplyTicketResponse setBody(ReplyTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplyTicketResponseBody getBody() {
        return this.body;
    }

}
