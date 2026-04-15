// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertDestinationsResponseBody body;

    public static ListAlertDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertDestinationsResponse self = new ListAlertDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertDestinationsResponse setBody(ListAlertDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertDestinationsResponseBody getBody() {
        return this.body;
    }

}
