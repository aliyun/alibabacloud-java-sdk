// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ReactivateDBClusterBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReactivateDBClusterBackupResponseBody body;

    public static ReactivateDBClusterBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDBClusterBackupResponse self = new ReactivateDBClusterBackupResponse();
        return TeaModel.build(map, self);
    }

    public ReactivateDBClusterBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReactivateDBClusterBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReactivateDBClusterBackupResponse setBody(ReactivateDBClusterBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public ReactivateDBClusterBackupResponseBody getBody() {
        return this.body;
    }

}
