// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchRestartApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRestartApplicationsResponseBody body;

    public static BatchRestartApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRestartApplicationsResponse self = new BatchRestartApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchRestartApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRestartApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRestartApplicationsResponse setBody(BatchRestartApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRestartApplicationsResponseBody getBody() {
        return this.body;
    }

}
