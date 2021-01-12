// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupResponseBody body;

    public static DeleteBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupResponse self = new DeleteBackupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupResponse setBody(DeleteBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupResponseBody getBody() {
        return this.body;
    }

}
