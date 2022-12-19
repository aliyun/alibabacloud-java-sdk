// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHoneypotNodeResponseBody body;

    public static GetHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeResponse self = new GetHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotNodeResponse setBody(GetHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
