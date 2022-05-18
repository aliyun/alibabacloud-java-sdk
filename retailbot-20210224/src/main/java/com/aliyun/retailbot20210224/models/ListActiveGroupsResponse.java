// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListActiveGroupsResponseBody body;

    public static ListActiveGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActiveGroupsResponse self = new ListActiveGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListActiveGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActiveGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActiveGroupsResponse setBody(ListActiveGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActiveGroupsResponseBody getBody() {
        return this.body;
    }

}
