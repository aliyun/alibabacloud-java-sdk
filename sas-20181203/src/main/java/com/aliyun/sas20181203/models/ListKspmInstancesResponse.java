// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListKspmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKspmInstancesResponseBody body;

    public static ListKspmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKspmInstancesResponse self = new ListKspmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListKspmInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKspmInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKspmInstancesResponse setBody(ListKspmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKspmInstancesResponseBody getBody() {
        return this.body;
    }

}
