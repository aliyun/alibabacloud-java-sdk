// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryDetailResponseBody body;

    public static GetMemoryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryDetailResponse self = new GetMemoryDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryDetailResponse setBody(GetMemoryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryDetailResponseBody getBody() {
        return this.body;
    }

}
