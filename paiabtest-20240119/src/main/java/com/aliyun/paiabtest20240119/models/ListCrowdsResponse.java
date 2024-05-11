// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListCrowdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrowdsResponseBody body;

    public static ListCrowdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrowdsResponse self = new ListCrowdsResponse();
        return TeaModel.build(map, self);
    }

    public ListCrowdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrowdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrowdsResponse setBody(ListCrowdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrowdsResponseBody getBody() {
        return this.body;
    }

}
