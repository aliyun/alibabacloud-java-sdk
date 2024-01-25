// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListJMeterReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJMeterReportsResponseBody body;

    public static ListJMeterReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJMeterReportsResponse self = new ListJMeterReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListJMeterReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJMeterReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJMeterReportsResponse setBody(ListJMeterReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJMeterReportsResponseBody getBody() {
        return this.body;
    }

}
