// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStopApplicationsResponseBody body;

    public static BatchStopApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsResponse self = new BatchStopApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStopApplicationsResponse setBody(BatchStopApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopApplicationsResponseBody getBody() {
        return this.body;
    }

}
