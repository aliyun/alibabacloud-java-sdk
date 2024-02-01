// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRouteEntryResponseBody body;

    public static ModifyRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteEntryResponse self = new ModifyRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRouteEntryResponse setBody(ModifyRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouteEntryResponseBody getBody() {
        return this.body;
    }

}
