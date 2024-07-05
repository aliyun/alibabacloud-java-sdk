// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchBindDirectoriesResponseBody body;

    public static BatchBindDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDirectoriesResponse self = new BatchBindDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindDirectoriesResponse setBody(BatchBindDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindDirectoriesResponseBody getBody() {
        return this.body;
    }

}
