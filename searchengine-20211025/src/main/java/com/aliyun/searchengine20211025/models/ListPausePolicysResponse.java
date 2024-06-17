// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPausePolicysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPausePolicysResponseBody body;

    public static ListPausePolicysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPausePolicysResponse self = new ListPausePolicysResponse();
        return TeaModel.build(map, self);
    }

    public ListPausePolicysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPausePolicysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPausePolicysResponse setBody(ListPausePolicysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPausePolicysResponseBody getBody() {
        return this.body;
    }

}
