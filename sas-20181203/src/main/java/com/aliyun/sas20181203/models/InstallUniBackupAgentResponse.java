// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallUniBackupAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallUniBackupAgentResponseBody body;

    public static InstallUniBackupAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallUniBackupAgentResponse self = new InstallUniBackupAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallUniBackupAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallUniBackupAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallUniBackupAgentResponse setBody(InstallUniBackupAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallUniBackupAgentResponseBody getBody() {
        return this.body;
    }

}
