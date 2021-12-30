// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class EvaluateTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EvaluateTicketResponse setBody(EvaluateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateTicketResponseBody getBody() {
        return this.body;
    }

}
