// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateSecurityIPModeResponseBody body;

    public static MigrateSecurityIPModeResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateSecurityIPModeResponse self = new MigrateSecurityIPModeResponse();
        return TeaModel.build(map, self);
    }

    public MigrateSecurityIPModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateSecurityIPModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateSecurityIPModeResponse setBody(MigrateSecurityIPModeResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateSecurityIPModeResponseBody getBody() {
        return this.body;
    }

}
