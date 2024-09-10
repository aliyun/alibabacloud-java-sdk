// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHybridProxyClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridProxyClusterResponseBody body;

    public static DeleteHybridProxyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridProxyClusterResponse self = new DeleteHybridProxyClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridProxyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridProxyClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridProxyClusterResponse setBody(DeleteHybridProxyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridProxyClusterResponseBody getBody() {
        return this.body;
    }

}
