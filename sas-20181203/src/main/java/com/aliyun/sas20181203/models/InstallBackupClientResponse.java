// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallBackupClientResponseBody body;

    public static InstallBackupClientResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientResponse self = new InstallBackupClientResponse();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallBackupClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallBackupClientResponse setBody(InstallBackupClientResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallBackupClientResponseBody getBody() {
        return this.body;
    }

}
