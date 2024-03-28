// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListTensorboardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTensorboardsResponseBody body;

    public static ListTensorboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTensorboardsResponse self = new ListTensorboardsResponse();
        return TeaModel.build(map, self);
    }

    public ListTensorboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTensorboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTensorboardsResponse setBody(ListTensorboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTensorboardsResponseBody getBody() {
        return this.body;
    }

}
