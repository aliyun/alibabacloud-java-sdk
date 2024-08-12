// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetUdfArtifactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUdfArtifactsResponseBody body;

    public static GetUdfArtifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUdfArtifactsResponse self = new GetUdfArtifactsResponse();
        return TeaModel.build(map, self);
    }

    public GetUdfArtifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUdfArtifactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUdfArtifactsResponse setBody(GetUdfArtifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUdfArtifactsResponseBody getBody() {
        return this.body;
    }

}
