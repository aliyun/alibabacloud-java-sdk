// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteReplicationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReplicationJobResponse setBody(DeleteReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReplicationJobResponseBody getBody() {
        return this.body;
    }

}
