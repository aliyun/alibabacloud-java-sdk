// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlgorithmsResponseBody body;

    public static ListAlgorithmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsResponse self = new ListAlgorithmsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlgorithmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlgorithmsResponse setBody(ListAlgorithmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlgorithmsResponseBody getBody() {
        return this.body;
    }

}
