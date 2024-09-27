// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CutOverReplicationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CutOverReplicationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CutOverReplicationJobResponse setBody(CutOverReplicationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CutOverReplicationJobResponseBody getBody() {
        return this.body;
    }

}
