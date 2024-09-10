// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHybridProxyClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridProxyClusterResponseBody body;

    public static CreateHybridProxyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridProxyClusterResponse self = new CreateHybridProxyClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridProxyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridProxyClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridProxyClusterResponse setBody(CreateHybridProxyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridProxyClusterResponseBody getBody() {
        return this.body;
    }

}
