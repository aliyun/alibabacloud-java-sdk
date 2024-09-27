// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class StartReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartReplicationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartReplicationJobResponse setBody(StartReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartReplicationJobResponseBody getBody() {
        return this.body;
    }

}
