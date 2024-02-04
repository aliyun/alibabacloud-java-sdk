// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSharedTargetsResponseBody body;

    public static ListSharedTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsResponse self = new ListSharedTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSharedTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSharedTargetsResponse setBody(ListSharedTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSharedTargetsResponseBody getBody() {
        return this.body;
    }

}
