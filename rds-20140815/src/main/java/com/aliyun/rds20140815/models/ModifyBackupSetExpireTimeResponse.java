// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupSetExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupSetExpireTimeResponseBody body;

    public static ModifyBackupSetExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSetExpireTimeResponse self = new ModifyBackupSetExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSetExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupSetExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupSetExpireTimeResponse setBody(ModifyBackupSetExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupSetExpireTimeResponseBody getBody() {
        return this.body;
    }

}
