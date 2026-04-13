// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisassociateMacSecKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateMacSecKeyResponseBody body;

    public static DisassociateMacSecKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMacSecKeyResponse self = new DisassociateMacSecKeyResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateMacSecKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateMacSecKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateMacSecKeyResponse setBody(DisassociateMacSecKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateMacSecKeyResponseBody getBody() {
        return this.body;
    }

}
