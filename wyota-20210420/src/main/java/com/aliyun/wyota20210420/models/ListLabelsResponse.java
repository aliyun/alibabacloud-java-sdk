// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLabelsResponseBody body;

    public static ListLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsResponse self = new ListLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLabelsResponse setBody(ListLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabelsResponseBody getBody() {
        return this.body;
    }

}
