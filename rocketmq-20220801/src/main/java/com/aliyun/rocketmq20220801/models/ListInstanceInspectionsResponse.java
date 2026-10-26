// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceInspectionsResponseBody body;

    public static ListInstanceInspectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionsResponse self = new ListInstanceInspectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceInspectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceInspectionsResponse setBody(ListInstanceInspectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceInspectionsResponseBody getBody() {
        return this.body;
    }

}
