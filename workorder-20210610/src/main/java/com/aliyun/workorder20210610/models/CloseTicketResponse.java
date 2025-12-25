// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CloseTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseTicketResponseBody body;

    public static CloseTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketResponse self = new CloseTicketResponse();
        return TeaModel.build(map, self);
    }

    public CloseTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseTicketResponse setBody(CloseTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseTicketResponseBody getBody() {
        return this.body;
    }

}
