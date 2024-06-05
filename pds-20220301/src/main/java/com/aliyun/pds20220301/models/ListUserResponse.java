// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserResponseBody body;

    public static ListUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserResponse self = new ListUserResponse();
        return TeaModel.build(map, self);
    }

    public ListUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserResponse setBody(ListUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserResponseBody getBody() {
        return this.body;
    }

}
