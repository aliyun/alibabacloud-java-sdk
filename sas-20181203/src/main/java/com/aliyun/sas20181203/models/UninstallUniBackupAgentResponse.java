// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallUniBackupAgentResponseBody body;

    public static UninstallUniBackupAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallUniBackupAgentResponse self = new UninstallUniBackupAgentResponse();
        return TeaModel.build(map, self);
    }

    public UninstallUniBackupAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallUniBackupAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallUniBackupAgentResponse setBody(UninstallUniBackupAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallUniBackupAgentResponseBody getBody() {
        return this.body;
    }

}
