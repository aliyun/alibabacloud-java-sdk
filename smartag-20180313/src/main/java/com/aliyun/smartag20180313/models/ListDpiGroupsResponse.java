// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDpiGroupsResponseBody body;

    public static ListDpiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDpiGroupsResponse self = new ListDpiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListDpiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDpiGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDpiGroupsResponse setBody(ListDpiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDpiGroupsResponseBody getBody() {
        return this.body;
    }

}
