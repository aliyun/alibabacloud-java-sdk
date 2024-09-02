// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSearchStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchStrategiesResponseBody body;

    public static ListSearchStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchStrategiesResponse self = new ListSearchStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchStrategiesResponse setBody(ListSearchStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchStrategiesResponseBody getBody() {
        return this.body;
    }

}
