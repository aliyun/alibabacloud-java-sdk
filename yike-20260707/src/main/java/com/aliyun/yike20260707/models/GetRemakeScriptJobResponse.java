// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetRemakeScriptJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRemakeScriptJobResponseBody body;

    public static GetRemakeScriptJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemakeScriptJobResponse self = new GetRemakeScriptJobResponse();
        return TeaModel.build(map, self);
    }

    public GetRemakeScriptJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRemakeScriptJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRemakeScriptJobResponse setBody(GetRemakeScriptJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRemakeScriptJobResponseBody getBody() {
        return this.body;
    }

}
