// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CutOverReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CutOverReplicationJobResponseBody body;

    public static CutOverReplicationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CutOverReplicationJobResponse self = new CutOverReplicationJobResponse();
        return TeaModel.build(map, self);
    }

    public CutOverReplicationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CutOverReplicationJobResponse setBody(CutOverReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CutOverReplicationJobResponseBody getBody() {
        return this.body;
    }

}
