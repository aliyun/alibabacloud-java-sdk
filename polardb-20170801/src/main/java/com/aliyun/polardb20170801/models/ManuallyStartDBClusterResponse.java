// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ManuallyStartDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManuallyStartDBClusterResponseBody body;

    public static ManuallyStartDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ManuallyStartDBClusterResponse self = new ManuallyStartDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public ManuallyStartDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManuallyStartDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManuallyStartDBClusterResponse setBody(ManuallyStartDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ManuallyStartDBClusterResponseBody getBody() {
        return this.body;
    }

}
