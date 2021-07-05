// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserBackupFileResponseBody body;

    public static UpdateUserBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBackupFileResponse self = new UpdateUserBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserBackupFileResponse setBody(UpdateUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserBackupFileResponseBody getBody() {
        return this.body;
    }

}
