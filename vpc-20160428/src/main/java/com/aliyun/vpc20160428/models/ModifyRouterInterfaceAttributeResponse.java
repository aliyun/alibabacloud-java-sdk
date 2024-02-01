// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRouterInterfaceAttributeResponseBody body;

    public static ModifyRouterInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeResponse self = new ModifyRouterInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouterInterfaceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRouterInterfaceAttributeResponse setBody(ModifyRouterInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouterInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
