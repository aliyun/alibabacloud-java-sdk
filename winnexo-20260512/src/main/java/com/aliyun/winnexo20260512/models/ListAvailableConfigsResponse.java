// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAvailableConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableConfigsResponseBody body;

    public static ListAvailableConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableConfigsResponse self = new ListAvailableConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableConfigsResponse setBody(ListAvailableConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableConfigsResponseBody getBody() {
        return this.body;
    }

}
