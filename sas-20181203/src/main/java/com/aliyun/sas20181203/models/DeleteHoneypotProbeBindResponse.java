// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHoneypotProbeBindResponseBody body;

    public static DeleteHoneypotProbeBindResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeBindResponse self = new DeleteHoneypotProbeBindResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoneypotProbeBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoneypotProbeBindResponse setBody(DeleteHoneypotProbeBindResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoneypotProbeBindResponseBody getBody() {
        return this.body;
    }

}
