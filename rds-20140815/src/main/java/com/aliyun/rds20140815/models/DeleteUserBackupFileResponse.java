// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserBackupFileResponseBody body;

    public static DeleteUserBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserBackupFileResponse self = new DeleteUserBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserBackupFileResponse setBody(DeleteUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserBackupFileResponseBody getBody() {
        return this.body;
    }

}
