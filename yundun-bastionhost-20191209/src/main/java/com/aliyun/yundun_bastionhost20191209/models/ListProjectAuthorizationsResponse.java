// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectAuthorizationsResponseBody body;

    public static ListProjectAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAuthorizationsResponse self = new ListProjectAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectAuthorizationsResponse setBody(ListProjectAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
