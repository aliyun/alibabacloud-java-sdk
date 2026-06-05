// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyHiveAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHiveAttributeResponseBody body;

    public static ModifyHiveAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiveAttributeResponse self = new ModifyHiveAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHiveAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHiveAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHiveAttributeResponse setBody(ModifyHiveAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHiveAttributeResponseBody getBody() {
        return this.body;
    }

}
