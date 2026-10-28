// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class GetReadonlyModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReadonlyModeResponseBody body;

    public static GetReadonlyModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReadonlyModeResponse self = new GetReadonlyModeResponse();
        return TeaModel.build(map, self);
    }

    public GetReadonlyModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReadonlyModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReadonlyModeResponse setBody(GetReadonlyModeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReadonlyModeResponseBody getBody() {
        return this.body;
    }

}
