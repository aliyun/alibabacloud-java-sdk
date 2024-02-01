// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConnectRouterInterfaceResponseBody body;

    public static ConnectRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceResponse self = new ConnectRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ConnectRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConnectRouterInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConnectRouterInterfaceResponse setBody(ConnectRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConnectRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
