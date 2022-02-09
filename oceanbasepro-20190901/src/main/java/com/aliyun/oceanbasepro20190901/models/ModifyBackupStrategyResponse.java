// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupStrategyResponseBody body;

    public static ModifyBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyResponse self = new ModifyBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupStrategyResponse setBody(ModifyBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
