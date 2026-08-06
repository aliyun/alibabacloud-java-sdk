// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallRestrictionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOutboundCallRestrictionResponseBody body;

    public static DeleteOutboundCallRestrictionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundCallRestrictionResponse self = new DeleteOutboundCallRestrictionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundCallRestrictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOutboundCallRestrictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOutboundCallRestrictionResponse setBody(DeleteOutboundCallRestrictionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOutboundCallRestrictionResponseBody getBody() {
        return this.body;
    }

}
