// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class TriggerCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerCheckResponseBody body;

    public static TriggerCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerCheckResponse self = new TriggerCheckResponse();
        return TeaModel.build(map, self);
    }

    public TriggerCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerCheckResponse setBody(TriggerCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerCheckResponseBody getBody() {
        return this.body;
    }

}
