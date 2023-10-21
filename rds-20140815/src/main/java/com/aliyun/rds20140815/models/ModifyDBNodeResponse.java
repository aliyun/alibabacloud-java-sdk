// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBNodeResponseBody body;

    public static ModifyDBNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeResponse self = new ModifyDBNodeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeResponse setBody(ModifyDBNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeResponseBody getBody() {
        return this.body;
    }

}
