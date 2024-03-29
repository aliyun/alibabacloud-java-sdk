// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagPortRouteProtocolResponseBody body;

    public static ModifySagPortRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRouteProtocolResponse self = new ModifySagPortRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagPortRouteProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagPortRouteProtocolResponse setBody(ModifySagPortRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagPortRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
