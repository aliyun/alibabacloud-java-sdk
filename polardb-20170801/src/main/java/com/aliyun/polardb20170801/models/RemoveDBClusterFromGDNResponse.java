// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveDBClusterFromGDNResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveDBClusterFromGDNResponse setBody(RemoveDBClusterFromGDNResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDBClusterFromGDNResponseBody getBody() {
        return this.body;
    }

}
