// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSIngestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOSSIngestionsResponseBody body;

    public static ListOSSIngestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOSSIngestionsResponse self = new ListOSSIngestionsResponse();
        return TeaModel.build(map, self);
    }

    public ListOSSIngestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOSSIngestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOSSIngestionsResponse setBody(ListOSSIngestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOSSIngestionsResponseBody getBody() {
        return this.body;
    }

}
