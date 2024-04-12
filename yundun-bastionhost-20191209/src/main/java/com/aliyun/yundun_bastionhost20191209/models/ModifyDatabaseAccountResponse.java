// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatabaseAccountResponseBody body;

    public static ModifyDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseAccountResponse self = new ModifyDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabaseAccountResponse setBody(ModifyDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
