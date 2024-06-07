// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrafficControlTargetResponseBody body;

    public static GetTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTargetResponse self = new GetTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrafficControlTargetResponse setBody(GetTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
