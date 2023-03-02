// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDatabaseInstanceDescriptionResponseBody body;

    public static ModifyDatabaseInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceDescriptionResponse self = new ModifyDatabaseInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabaseInstanceDescriptionResponse setBody(ModifyDatabaseInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
