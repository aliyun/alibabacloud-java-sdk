// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListConstraintsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConstraintsResponseBody body;

    public static ListConstraintsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConstraintsResponse self = new ListConstraintsResponse();
        return TeaModel.build(map, self);
    }

    public ListConstraintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConstraintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConstraintsResponse setBody(ListConstraintsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConstraintsResponseBody getBody() {
        return this.body;
    }

}
