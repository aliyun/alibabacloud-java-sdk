// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRouteTableAttributesResponseBody body;

    public static ModifyRouteTableAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesResponse self = new ModifyRouteTableAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouteTableAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouteTableAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRouteTableAttributesResponse setBody(ModifyRouteTableAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouteTableAttributesResponseBody getBody() {
        return this.body;
    }

}
