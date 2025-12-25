// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class EvaluateTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvaluateTicketResponseBody body;

    public static EvaluateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateTicketResponse self = new EvaluateTicketResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateTicketResponse setBody(EvaluateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateTicketResponseBody getBody() {
        return this.body;
    }

}
