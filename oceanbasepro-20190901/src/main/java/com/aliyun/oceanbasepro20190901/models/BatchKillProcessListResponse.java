// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchKillProcessListResponseBody body;

    public static BatchKillProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchKillProcessListResponse self = new BatchKillProcessListResponse();
        return TeaModel.build(map, self);
    }

    public BatchKillProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchKillProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchKillProcessListResponse setBody(BatchKillProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchKillProcessListResponseBody getBody() {
        return this.body;
    }

}
