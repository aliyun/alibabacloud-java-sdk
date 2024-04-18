// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationGroupsResponseBody body;

    public static ListApplicationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsResponse self = new ListApplicationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationGroupsResponse setBody(ListApplicationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationGroupsResponseBody getBody() {
        return this.body;
    }

}
