// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupStrategyResponseBody body;

    public static DeleteBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupStrategyResponse self = new DeleteBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupStrategyResponse setBody(DeleteBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
