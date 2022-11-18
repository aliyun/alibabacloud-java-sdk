// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagStaticRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagStaticRouteResponseBody body;

    public static ModifySagStaticRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagStaticRouteResponse self = new ModifySagStaticRouteResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagStaticRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagStaticRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagStaticRouteResponse setBody(ModifySagStaticRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagStaticRouteResponseBody getBody() {
        return this.body;
    }

}
