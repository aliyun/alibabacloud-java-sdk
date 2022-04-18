// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReopenTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ReopenTicketResponse setBody(ReopenTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenTicketResponseBody getBody() {
        return this.body;
    }

}
