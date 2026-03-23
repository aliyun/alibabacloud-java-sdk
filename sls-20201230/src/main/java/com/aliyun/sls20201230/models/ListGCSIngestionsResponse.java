// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListGCSIngestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGCSIngestionsResponseBody body;

    public static ListGCSIngestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGCSIngestionsResponse self = new ListGCSIngestionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGCSIngestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGCSIngestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGCSIngestionsResponse setBody(ListGCSIngestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGCSIngestionsResponseBody getBody() {
        return this.body;
    }

}
