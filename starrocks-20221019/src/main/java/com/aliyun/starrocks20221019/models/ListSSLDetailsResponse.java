// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListSSLDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSSLDetailsResponseBody body;

    public static ListSSLDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSSLDetailsResponse self = new ListSSLDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListSSLDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSSLDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSSLDetailsResponse setBody(ListSSLDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSSLDetailsResponseBody getBody() {
        return this.body;
    }

}
