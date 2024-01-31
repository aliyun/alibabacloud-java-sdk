// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateUserBackupFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserBackupFileResponse setBody(UpdateUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserBackupFileResponseBody getBody() {
        return this.body;
    }

}
