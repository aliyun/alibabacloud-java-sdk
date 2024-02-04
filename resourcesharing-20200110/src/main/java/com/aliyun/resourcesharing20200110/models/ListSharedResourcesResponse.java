// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSharedResourcesResponseBody body;

    public static ListSharedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesResponse self = new ListSharedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSharedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSharedResourcesResponse setBody(ListSharedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSharedResourcesResponseBody getBody() {
        return this.body;
    }

}
