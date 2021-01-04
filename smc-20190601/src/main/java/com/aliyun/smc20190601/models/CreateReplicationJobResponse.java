// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateReplicationJobResponse setBody(CreateReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReplicationJobResponseBody getBody() {
        return this.body;
    }

}
