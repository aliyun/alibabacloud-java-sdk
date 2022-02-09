// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartBackupStrategyResponseBody body;

    public static StartBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBackupStrategyResponse self = new StartBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public StartBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBackupStrategyResponse setBody(StartBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
