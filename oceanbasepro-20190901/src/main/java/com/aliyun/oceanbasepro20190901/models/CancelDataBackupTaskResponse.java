// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelDataBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDataBackupTaskResponseBody body;

    public static CancelDataBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDataBackupTaskResponse self = new CancelDataBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelDataBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDataBackupTaskResponse setBody(CancelDataBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDataBackupTaskResponseBody getBody() {
        return this.body;
    }

}
