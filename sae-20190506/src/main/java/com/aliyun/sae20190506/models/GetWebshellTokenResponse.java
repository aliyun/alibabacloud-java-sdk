// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWebshellTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebshellTokenResponseBody body;

    public static GetWebshellTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebshellTokenResponse self = new GetWebshellTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetWebshellTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebshellTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebshellTokenResponse setBody(GetWebshellTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebshellTokenResponseBody getBody() {
        return this.body;
    }

}
