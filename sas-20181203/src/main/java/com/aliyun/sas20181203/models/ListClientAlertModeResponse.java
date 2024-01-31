// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientAlertModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientAlertModeResponseBody body;

    public static ListClientAlertModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientAlertModeResponse self = new ListClientAlertModeResponse();
        return TeaModel.build(map, self);
    }

    public ListClientAlertModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientAlertModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientAlertModeResponse setBody(ListClientAlertModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientAlertModeResponseBody getBody() {
        return this.body;
    }

}
