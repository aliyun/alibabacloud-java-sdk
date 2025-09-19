// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertStrategiesResponseBody body;

    public static ListAlertStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertStrategiesResponse self = new ListAlertStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertStrategiesResponse setBody(ListAlertStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertStrategiesResponseBody getBody() {
        return this.body;
    }

}
