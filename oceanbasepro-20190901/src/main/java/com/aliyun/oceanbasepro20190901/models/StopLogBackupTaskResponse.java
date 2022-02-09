// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopLogBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLogBackupTaskResponseBody body;

    public static StopLogBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLogBackupTaskResponse self = new StopLogBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopLogBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLogBackupTaskResponse setBody(StopLogBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLogBackupTaskResponseBody getBody() {
        return this.body;
    }

}
