// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
