// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactivateRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateRouterInterfaceResponseBody body;

    public static DeactivateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateRouterInterfaceResponse self = new DeactivateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateRouterInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateRouterInterfaceResponse setBody(DeactivateRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
