// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrafficControlTaskResponseBody body;

    public static GetTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskResponse self = new GetTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrafficControlTaskResponse setBody(GetTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
