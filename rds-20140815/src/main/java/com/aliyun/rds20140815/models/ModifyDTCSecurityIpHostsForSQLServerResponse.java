// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDTCSecurityIpHostsForSQLServerResponseBody body;

    public static ModifyDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerResponse self = new ModifyDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setBody(ModifyDTCSecurityIpHostsForSQLServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDTCSecurityIpHostsForSQLServerResponseBody getBody() {
        return this.body;
    }

}
