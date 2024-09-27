// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReplicationJobResponseBody body;

    public static CreateReplicationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationJobResponse self = new CreateReplicationJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateReplicationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReplicationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReplicationJobResponse setBody(CreateReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReplicationJobResponseBody getBody() {
        return this.body;
    }

}
