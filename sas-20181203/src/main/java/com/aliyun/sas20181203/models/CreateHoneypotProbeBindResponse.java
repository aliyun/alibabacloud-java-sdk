// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHoneypotProbeBindResponseBody body;

    public static CreateHoneypotProbeBindResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotProbeBindResponse self = new CreateHoneypotProbeBindResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotProbeBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoneypotProbeBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoneypotProbeBindResponse setBody(CreateHoneypotProbeBindResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoneypotProbeBindResponseBody getBody() {
        return this.body;
    }

}
