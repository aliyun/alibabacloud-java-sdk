// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListGpuClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListGpuClusterResponseBody body;

    public static GetListGpuClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListGpuClusterResponse self = new GetListGpuClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetListGpuClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListGpuClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListGpuClusterResponse setBody(GetListGpuClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListGpuClusterResponseBody getBody() {
        return this.body;
    }

}
