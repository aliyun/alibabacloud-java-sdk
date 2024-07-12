// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetActionResponseBody body;

    public static GetActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActionResponse self = new GetActionResponse();
        return TeaModel.build(map, self);
    }

    public GetActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetActionResponse setBody(GetActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActionResponseBody getBody() {
        return this.body;
    }

}
