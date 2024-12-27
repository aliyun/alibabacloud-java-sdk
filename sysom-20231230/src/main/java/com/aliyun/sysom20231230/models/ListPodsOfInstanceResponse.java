// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPodsOfInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPodsOfInstanceResponseBody body;

    public static ListPodsOfInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPodsOfInstanceResponse self = new ListPodsOfInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListPodsOfInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPodsOfInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPodsOfInstanceResponse setBody(ListPodsOfInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPodsOfInstanceResponseBody getBody() {
        return this.body;
    }

}
