// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportJobsResponseBody body;

    public static ImportJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportJobsResponse self = new ImportJobsResponse();
        return TeaModel.build(map, self);
    }

    public ImportJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportJobsResponse setBody(ImportJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportJobsResponseBody getBody() {
        return this.body;
    }

}
