// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceResourcesResponseBody body;

    public static ListInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourcesResponse self = new ListInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceResourcesResponse setBody(ListInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
