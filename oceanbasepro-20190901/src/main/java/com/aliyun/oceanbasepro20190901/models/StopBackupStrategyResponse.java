// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopBackupStrategyResponseBody body;

    public static StopBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBackupStrategyResponse self = new StopBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public StopBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBackupStrategyResponse setBody(StopBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
