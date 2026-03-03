// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetTraceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTraceDetailResponseBody body;

    public static GetTraceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceDetailResponse self = new GetTraceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTraceDetailResponse setBody(GetTraceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceDetailResponseBody getBody() {
        return this.body;
    }

}
