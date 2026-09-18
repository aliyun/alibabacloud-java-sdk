// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGroupDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupDirectoriesResponseBody body;

    public static ListGroupDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDirectoriesResponse self = new ListGroupDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupDirectoriesResponse setBody(ListGroupDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupDirectoriesResponseBody getBody() {
        return this.body;
    }

}
