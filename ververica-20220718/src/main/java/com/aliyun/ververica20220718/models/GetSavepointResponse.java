// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetSavepointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSavepointResponseBody body;

    public static GetSavepointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavepointResponse self = new GetSavepointResponse();
        return TeaModel.build(map, self);
    }

    public GetSavepointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavepointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSavepointResponse setBody(GetSavepointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSavepointResponseBody getBody() {
        return this.body;
    }

}
