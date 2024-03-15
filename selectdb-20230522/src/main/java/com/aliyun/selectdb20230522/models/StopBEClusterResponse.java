// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class StopBEClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopBEClusterResponseBody body;

    public static StopBEClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBEClusterResponse self = new StopBEClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopBEClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBEClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopBEClusterResponse setBody(StopBEClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBEClusterResponseBody getBody() {
        return this.body;
    }

}
