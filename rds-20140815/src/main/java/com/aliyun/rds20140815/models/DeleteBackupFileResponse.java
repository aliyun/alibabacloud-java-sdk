// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupFileResponseBody body;

    public static DeleteBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponse self = new DeleteBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupFileResponse setBody(DeleteBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupFileResponseBody getBody() {
        return this.body;
    }

}
