// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListTableMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableMetasResponseBody body;

    public static ListTableMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableMetasResponse self = new ListTableMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListTableMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableMetasResponse setBody(ListTableMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableMetasResponseBody getBody() {
        return this.body;
    }

}
