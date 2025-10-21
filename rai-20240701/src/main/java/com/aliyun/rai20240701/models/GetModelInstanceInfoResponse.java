// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelInstanceInfoResponseBody body;

    public static GetModelInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelInstanceInfoResponse self = new GetModelInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetModelInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelInstanceInfoResponse setBody(GetModelInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
