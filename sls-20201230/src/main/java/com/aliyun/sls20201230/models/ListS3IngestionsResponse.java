// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListS3IngestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListS3IngestionsResponseBody body;

    public static ListS3IngestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListS3IngestionsResponse self = new ListS3IngestionsResponse();
        return TeaModel.build(map, self);
    }

    public ListS3IngestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListS3IngestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListS3IngestionsResponse setBody(ListS3IngestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListS3IngestionsResponseBody getBody() {
        return this.body;
    }

}
