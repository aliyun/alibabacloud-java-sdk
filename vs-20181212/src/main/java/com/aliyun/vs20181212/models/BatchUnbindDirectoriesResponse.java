// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUnbindDirectoriesResponseBody body;

    public static BatchUnbindDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDirectoriesResponse self = new BatchUnbindDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUnbindDirectoriesResponse setBody(BatchUnbindDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindDirectoriesResponseBody getBody() {
        return this.body;
    }

}
