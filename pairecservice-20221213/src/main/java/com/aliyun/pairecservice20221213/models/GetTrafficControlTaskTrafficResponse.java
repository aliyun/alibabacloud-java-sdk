// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrafficControlTaskTrafficResponseBody body;

    public static GetTrafficControlTaskTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskTrafficResponse self = new GetTrafficControlTaskTrafficResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficControlTaskTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrafficControlTaskTrafficResponse setBody(GetTrafficControlTaskTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficControlTaskTrafficResponseBody getBody() {
        return this.body;
    }

}
