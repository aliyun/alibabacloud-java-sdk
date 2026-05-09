// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppInstanceResponseBody body;

    public static ModifyAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceResponse self = new ModifyAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppInstanceResponse setBody(ModifyAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppInstanceResponseBody getBody() {
        return this.body;
    }

}
