// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPhysicalConnectionAttributeResponseBody body;

    public static ModifyPhysicalConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeResponse self = new ModifyPhysicalConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhysicalConnectionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPhysicalConnectionAttributeResponse setBody(ModifyPhysicalConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhysicalConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
