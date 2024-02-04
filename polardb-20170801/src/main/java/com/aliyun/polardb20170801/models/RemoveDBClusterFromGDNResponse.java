// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveDBClusterFromGDNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDBClusterFromGDNResponseBody body;

    public static RemoveDBClusterFromGDNResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDBClusterFromGDNResponse self = new RemoveDBClusterFromGDNResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDBClusterFromGDNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDBClusterFromGDNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDBClusterFromGDNResponse setBody(RemoveDBClusterFromGDNResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDBClusterFromGDNResponseBody getBody() {
        return this.body;
    }

}
