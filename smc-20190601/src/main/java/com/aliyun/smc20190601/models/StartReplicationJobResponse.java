// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class StartReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartReplicationJobResponseBody body;

    public static StartReplicationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartReplicationJobResponse self = new StartReplicationJobResponse();
        return TeaModel.build(map, self);
    }

    public StartReplicationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartReplicationJobResponse setBody(StartReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartReplicationJobResponseBody getBody() {
        return this.body;
    }

}
