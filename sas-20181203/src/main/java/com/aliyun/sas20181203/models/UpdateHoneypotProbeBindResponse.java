// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoneypotProbeBindResponseBody body;

    public static UpdateHoneypotProbeBindResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotProbeBindResponse self = new UpdateHoneypotProbeBindResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotProbeBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoneypotProbeBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoneypotProbeBindResponse setBody(UpdateHoneypotProbeBindResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoneypotProbeBindResponseBody getBody() {
        return this.body;
    }

}
