// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoneypotResponseBody body;

    public static UpdateHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotResponse self = new UpdateHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoneypotResponse setBody(UpdateHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoneypotResponseBody getBody() {
        return this.body;
    }

}
