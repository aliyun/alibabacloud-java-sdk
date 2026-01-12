// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditStsAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArEditStsAuthResponseBody body;

    public static GetArEditStsAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArEditStsAuthResponse self = new GetArEditStsAuthResponse();
        return TeaModel.build(map, self);
    }

    public GetArEditStsAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArEditStsAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArEditStsAuthResponse setBody(GetArEditStsAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArEditStsAuthResponseBody getBody() {
        return this.body;
    }

}
