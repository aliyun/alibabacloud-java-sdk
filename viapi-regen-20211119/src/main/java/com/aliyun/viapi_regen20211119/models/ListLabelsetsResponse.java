// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListLabelsetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLabelsetsResponseBody body;

    public static ListLabelsetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsetsResponse self = new ListLabelsetsResponse();
        return TeaModel.build(map, self);
    }

    public ListLabelsetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabelsetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLabelsetsResponse setBody(ListLabelsetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabelsetsResponseBody getBody() {
        return this.body;
    }

}
