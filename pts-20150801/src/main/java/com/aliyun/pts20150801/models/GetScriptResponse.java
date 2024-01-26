// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScriptResponseBody body;

    public static GetScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScriptResponse self = new GetScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScriptResponse setBody(GetScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScriptResponseBody getBody() {
        return this.body;
    }

}
