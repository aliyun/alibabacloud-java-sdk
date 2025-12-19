// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBusinessRegionsResponseBody body;

    public static ListBusinessRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessRegionsResponse self = new ListBusinessRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusinessRegionsResponse setBody(ListBusinessRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessRegionsResponseBody getBody() {
        return this.body;
    }

}
