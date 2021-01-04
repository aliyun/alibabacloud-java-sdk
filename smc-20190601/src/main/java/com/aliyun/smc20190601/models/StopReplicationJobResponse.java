// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class StopReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopReplicationJobResponseBody body;

    public static StopReplicationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopReplicationJobResponse self = new StopReplicationJobResponse();
        return TeaModel.build(map, self);
    }

    public StopReplicationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopReplicationJobResponse setBody(StopReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopReplicationJobResponseBody getBody() {
        return this.body;
    }

}
