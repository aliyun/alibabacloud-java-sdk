// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackGroupsResponseBody body;

    public static ListStackGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponse self = new ListStackGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackGroupsResponse setBody(ListStackGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupsResponseBody getBody() {
        return this.body;
    }

}
