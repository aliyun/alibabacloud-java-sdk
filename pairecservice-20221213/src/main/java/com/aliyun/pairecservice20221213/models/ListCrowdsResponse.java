// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCrowdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
