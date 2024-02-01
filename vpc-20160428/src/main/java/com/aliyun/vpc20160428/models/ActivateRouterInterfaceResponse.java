// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateRouterInterfaceResponseBody body;

    public static ActivateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceResponse self = new ActivateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateRouterInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateRouterInterfaceResponse setBody(ActivateRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
