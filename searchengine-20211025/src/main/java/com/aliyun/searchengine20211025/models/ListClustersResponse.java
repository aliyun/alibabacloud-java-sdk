// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClustersResponseBody body;

    public static ListClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponse self = new ListClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClustersResponse setBody(ListClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClustersResponseBody getBody() {
        return this.body;
    }

}
