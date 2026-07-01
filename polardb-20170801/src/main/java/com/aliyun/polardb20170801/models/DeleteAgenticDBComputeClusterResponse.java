// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBComputeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDBComputeClusterResponseBody body;

    public static DeleteAgenticDBComputeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBComputeClusterResponse self = new DeleteAgenticDBComputeClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBComputeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDBComputeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDBComputeClusterResponse setBody(DeleteAgenticDBComputeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDBComputeClusterResponseBody getBody() {
        return this.body;
    }

}
