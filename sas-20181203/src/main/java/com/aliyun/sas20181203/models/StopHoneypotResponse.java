// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StopHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopHoneypotResponseBody body;

    public static StopHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        StopHoneypotResponse self = new StopHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public StopHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopHoneypotResponse setBody(StopHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public StopHoneypotResponseBody getBody() {
        return this.body;
    }

}
