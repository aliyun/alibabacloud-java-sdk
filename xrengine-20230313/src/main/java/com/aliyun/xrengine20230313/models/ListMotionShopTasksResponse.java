// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListMotionShopTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMotionShopTasksResponseBody body;

    public static ListMotionShopTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMotionShopTasksResponse self = new ListMotionShopTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMotionShopTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMotionShopTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMotionShopTasksResponse setBody(ListMotionShopTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMotionShopTasksResponseBody getBody() {
        return this.body;
    }

}
