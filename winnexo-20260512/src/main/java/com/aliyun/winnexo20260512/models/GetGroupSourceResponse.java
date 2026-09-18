// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGroupSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupSourceResponseBody body;

    public static GetGroupSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupSourceResponse self = new GetGroupSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupSourceResponse setBody(GetGroupSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupSourceResponseBody getBody() {
        return this.body;
    }

}
