// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyEngineMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEngineMigrationResponseBody body;

    public static ModifyEngineMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEngineMigrationResponse self = new ModifyEngineMigrationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEngineMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEngineMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEngineMigrationResponse setBody(ModifyEngineMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEngineMigrationResponseBody getBody() {
        return this.body;
    }

}
