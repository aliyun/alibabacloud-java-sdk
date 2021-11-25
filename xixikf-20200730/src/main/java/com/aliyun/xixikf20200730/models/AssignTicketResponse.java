// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class AssignTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssignTicketResponseBody body;

    public static AssignTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketResponse self = new AssignTicketResponse();
        return TeaModel.build(map, self);
    }

    public AssignTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignTicketResponse setBody(AssignTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignTicketResponseBody getBody() {
        return this.body;
    }

}
