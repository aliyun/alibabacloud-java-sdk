// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackupStrategyResponseBody body;

    public static CreateBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupStrategyResponse self = new CreateBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupStrategyResponse setBody(CreateBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
