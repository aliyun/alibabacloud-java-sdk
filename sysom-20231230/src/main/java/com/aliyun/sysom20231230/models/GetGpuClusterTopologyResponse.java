// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGpuClusterTopologyResponseBody body;

    public static GetGpuClusterTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterTopologyResponse self = new GetGpuClusterTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGpuClusterTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGpuClusterTopologyResponse setBody(GetGpuClusterTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGpuClusterTopologyResponseBody getBody() {
        return this.body;
    }

}
