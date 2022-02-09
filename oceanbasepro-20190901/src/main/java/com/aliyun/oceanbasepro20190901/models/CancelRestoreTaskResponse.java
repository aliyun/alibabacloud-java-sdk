// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelRestoreTaskResponseBody body;

    public static CancelRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRestoreTaskResponse self = new CancelRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRestoreTaskResponse setBody(CancelRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
