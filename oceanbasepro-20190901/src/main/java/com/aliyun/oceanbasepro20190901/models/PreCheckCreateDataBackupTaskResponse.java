// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class PreCheckCreateDataBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreCheckCreateDataBackupTaskResponseBody body;

    public static PreCheckCreateDataBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateDataBackupTaskResponse self = new PreCheckCreateDataBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateDataBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckCreateDataBackupTaskResponse setBody(PreCheckCreateDataBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckCreateDataBackupTaskResponseBody getBody() {
        return this.body;
    }

}
