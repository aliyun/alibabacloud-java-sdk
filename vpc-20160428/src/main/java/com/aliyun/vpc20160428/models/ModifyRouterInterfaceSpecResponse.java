// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRouterInterfaceSpecResponseBody body;

    public static ModifyRouterInterfaceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecResponse self = new ModifyRouterInterfaceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouterInterfaceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRouterInterfaceSpecResponse setBody(ModifyRouterInterfaceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouterInterfaceSpecResponseBody getBody() {
        return this.body;
    }

}
