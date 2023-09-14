// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCrowdUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCrowdUsersResponseBody body;

    public static ListCrowdUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrowdUsersResponse self = new ListCrowdUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListCrowdUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrowdUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrowdUsersResponse setBody(ListCrowdUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrowdUsersResponseBody getBody() {
        return this.body;
    }

}
