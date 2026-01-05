// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListLaunchOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLaunchOptionsResponseBody body;

    public static ListLaunchOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLaunchOptionsResponse self = new ListLaunchOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListLaunchOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLaunchOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLaunchOptionsResponse setBody(ListLaunchOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLaunchOptionsResponseBody getBody() {
        return this.body;
    }

}
