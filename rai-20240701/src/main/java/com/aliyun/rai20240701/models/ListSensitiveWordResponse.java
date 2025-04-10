// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSensitiveWordResponseBody body;

    public static ListSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveWordResponse self = new ListSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitiveWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSensitiveWordResponse setBody(ListSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
