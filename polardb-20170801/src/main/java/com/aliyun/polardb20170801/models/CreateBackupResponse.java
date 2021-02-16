// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackupResponseBody body;

    public static CreateBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponse self = new CreateBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupResponse setBody(CreateBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupResponseBody getBody() {
        return this.body;
    }

}
