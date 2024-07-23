// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListEngineConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEngineConfigsResponseBody body;

    public static ListEngineConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEngineConfigsResponse self = new ListEngineConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListEngineConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEngineConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEngineConfigsResponse setBody(ListEngineConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEngineConfigsResponseBody getBody() {
        return this.body;
    }

}
