// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetTicketByCaseIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTicketByCaseIdResponseBody body;

    public static GetTicketByCaseIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketByCaseIdResponse self = new GetTicketByCaseIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketByCaseIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketByCaseIdResponse setBody(GetTicketByCaseIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketByCaseIdResponseBody getBody() {
        return this.body;
    }

}
