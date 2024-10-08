// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppGroupsResponseBody body;

    public static ListAppGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsResponse self = new ListAppGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppGroupsResponse setBody(ListAppGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupsResponseBody getBody() {
        return this.body;
    }

}
