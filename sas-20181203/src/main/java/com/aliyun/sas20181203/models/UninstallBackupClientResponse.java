// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallBackupClientResponseBody body;

    public static UninstallBackupClientResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientResponse self = new UninstallBackupClientResponse();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallBackupClientResponse setBody(UninstallBackupClientResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallBackupClientResponseBody getBody() {
        return this.body;
    }

}
