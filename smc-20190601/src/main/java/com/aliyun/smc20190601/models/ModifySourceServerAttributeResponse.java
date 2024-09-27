// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifySourceServerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySourceServerAttributeResponseBody body;

    public static ModifySourceServerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySourceServerAttributeResponse self = new ModifySourceServerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySourceServerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySourceServerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySourceServerAttributeResponse setBody(ModifySourceServerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySourceServerAttributeResponseBody getBody() {
        return this.body;
    }

}
