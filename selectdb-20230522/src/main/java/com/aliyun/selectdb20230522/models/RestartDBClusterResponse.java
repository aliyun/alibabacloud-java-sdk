// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class RestartDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDBClusterResponseBody body;

    public static RestartDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBClusterResponse self = new RestartDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDBClusterResponse setBody(RestartDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDBClusterResponseBody getBody() {
        return this.body;
    }

}
