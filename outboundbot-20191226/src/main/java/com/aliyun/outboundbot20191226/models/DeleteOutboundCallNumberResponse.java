// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOutboundCallNumberResponseBody body;

    public static DeleteOutboundCallNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundCallNumberResponse self = new DeleteOutboundCallNumberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundCallNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOutboundCallNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOutboundCallNumberResponse setBody(DeleteOutboundCallNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOutboundCallNumberResponseBody getBody() {
        return this.body;
    }

}
