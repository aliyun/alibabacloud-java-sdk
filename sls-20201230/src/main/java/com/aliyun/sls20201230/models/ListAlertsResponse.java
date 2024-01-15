// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAlertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlertsResponseBody body;

    public static ListAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponse self = new ListAlertsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertsResponse setBody(ListAlertsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertsResponseBody getBody() {
        return this.body;
    }

}
