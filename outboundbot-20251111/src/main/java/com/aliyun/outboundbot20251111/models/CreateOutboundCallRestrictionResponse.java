// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateOutboundCallRestrictionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOutboundCallRestrictionResponseBody body;

    public static CreateOutboundCallRestrictionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallRestrictionResponse self = new CreateOutboundCallRestrictionResponse();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallRestrictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOutboundCallRestrictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOutboundCallRestrictionResponse setBody(CreateOutboundCallRestrictionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOutboundCallRestrictionResponseBody getBody() {
        return this.body;
    }

}
