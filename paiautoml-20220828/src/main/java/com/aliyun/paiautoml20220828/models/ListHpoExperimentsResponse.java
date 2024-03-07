// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoExperimentsResponseBody body;

    public static ListHpoExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentsResponse self = new ListHpoExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoExperimentsResponse setBody(ListHpoExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoExperimentsResponseBody getBody() {
        return this.body;
    }

}
