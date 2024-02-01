// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHaVipAttributeResponseBody body;

    public static ModifyHaVipAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeResponse self = new ModifyHaVipAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHaVipAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHaVipAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHaVipAttributeResponse setBody(ModifyHaVipAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHaVipAttributeResponseBody getBody() {
        return this.body;
    }

}
