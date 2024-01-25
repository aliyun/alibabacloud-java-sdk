// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetComputeResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeResultResponseBody body;

    public static GetComputeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResultResponse self = new GetComputeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeResultResponse setBody(GetComputeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeResultResponseBody getBody() {
        return this.body;
    }

}
