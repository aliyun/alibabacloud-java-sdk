// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRevisionResponseBody body;

    public static ListRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRevisionResponse self = new ListRevisionResponse();
        return TeaModel.build(map, self);
    }

    public ListRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRevisionResponse setBody(ListRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRevisionResponseBody getBody() {
        return this.body;
    }

}
