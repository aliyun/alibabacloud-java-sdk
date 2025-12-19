// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppInstancesResponseBody body;

    public static ListAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesResponse self = new ListAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstancesResponse setBody(ListAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstancesResponseBody getBody() {
        return this.body;
    }

}
