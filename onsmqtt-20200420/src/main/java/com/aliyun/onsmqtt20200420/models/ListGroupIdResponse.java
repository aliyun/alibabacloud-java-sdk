// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupIdResponseBody body;

    public static ListGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIdResponse self = new ListGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupIdResponse setBody(ListGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupIdResponseBody getBody() {
        return this.body;
    }

}
