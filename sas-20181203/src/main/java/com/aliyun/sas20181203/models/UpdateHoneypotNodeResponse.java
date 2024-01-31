// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoneypotNodeResponseBody body;

    public static UpdateHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotNodeResponse self = new UpdateHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoneypotNodeResponse setBody(UpdateHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
