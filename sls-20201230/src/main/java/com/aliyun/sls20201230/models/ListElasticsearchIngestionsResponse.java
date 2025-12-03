// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListElasticsearchIngestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListElasticsearchIngestionsResponseBody body;

    public static ListElasticsearchIngestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListElasticsearchIngestionsResponse self = new ListElasticsearchIngestionsResponse();
        return TeaModel.build(map, self);
    }

    public ListElasticsearchIngestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListElasticsearchIngestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListElasticsearchIngestionsResponse setBody(ListElasticsearchIngestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListElasticsearchIngestionsResponseBody getBody() {
        return this.body;
    }

}
