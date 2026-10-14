// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterArgsOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGpuClusterArgsOptionsResponseBody body;

    public static GetGpuClusterArgsOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterArgsOptionsResponse self = new GetGpuClusterArgsOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterArgsOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGpuClusterArgsOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGpuClusterArgsOptionsResponse setBody(GetGpuClusterArgsOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGpuClusterArgsOptionsResponseBody getBody() {
        return this.body;
    }

}
