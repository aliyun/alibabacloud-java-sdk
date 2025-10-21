// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelInstanceResponseBody body;

    public static ListModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelInstanceResponse self = new ListModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelInstanceResponse setBody(ListModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelInstanceResponseBody getBody() {
        return this.body;
    }

}
