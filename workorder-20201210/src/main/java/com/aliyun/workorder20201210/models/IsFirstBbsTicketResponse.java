// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class IsFirstBbsTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IsFirstBbsTicketResponseBody body;

    public static IsFirstBbsTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        IsFirstBbsTicketResponse self = new IsFirstBbsTicketResponse();
        return TeaModel.build(map, self);
    }

    public IsFirstBbsTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsFirstBbsTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsFirstBbsTicketResponse setBody(IsFirstBbsTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public IsFirstBbsTicketResponseBody getBody() {
        return this.body;
    }

}
