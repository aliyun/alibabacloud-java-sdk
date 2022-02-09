// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateDataBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataBackupTaskResponseBody body;

    public static CreateDataBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataBackupTaskResponse self = new CreateDataBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataBackupTaskResponse setBody(CreateDataBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataBackupTaskResponseBody getBody() {
        return this.body;
    }

}
