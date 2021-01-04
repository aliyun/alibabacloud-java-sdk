// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteReplicationJobResponseBody body;

    public static DeleteReplicationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicationJobResponse self = new DeleteReplicationJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReplicationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReplicationJobResponse setBody(DeleteReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReplicationJobResponseBody getBody() {
        return this.body;
    }

}
