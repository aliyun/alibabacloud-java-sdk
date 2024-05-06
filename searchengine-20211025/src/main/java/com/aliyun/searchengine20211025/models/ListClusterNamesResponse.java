// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterNamesResponseBody body;

    public static ListClusterNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNamesResponse self = new ListClusterNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterNamesResponse setBody(ListClusterNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterNamesResponseBody getBody() {
        return this.body;
    }

}
