// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListClassesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClassesResponseBody body;

    public static ListClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClassesResponse self = new ListClassesResponse();
        return TeaModel.build(map, self);
    }

    public ListClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClassesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClassesResponse setBody(ListClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClassesResponseBody getBody() {
        return this.body;
    }

}
