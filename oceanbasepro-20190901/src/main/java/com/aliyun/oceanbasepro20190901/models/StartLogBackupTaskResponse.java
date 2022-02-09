// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartLogBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLogBackupTaskResponseBody body;

    public static StartLogBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLogBackupTaskResponse self = new StartLogBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartLogBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLogBackupTaskResponse setBody(StartLogBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLogBackupTaskResponseBody getBody() {
        return this.body;
    }

}
