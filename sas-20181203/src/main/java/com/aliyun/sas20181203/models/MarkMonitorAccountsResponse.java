// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class MarkMonitorAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MarkMonitorAccountsResponseBody body;

    public static MarkMonitorAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkMonitorAccountsResponse self = new MarkMonitorAccountsResponse();
        return TeaModel.build(map, self);
    }

    public MarkMonitorAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkMonitorAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkMonitorAccountsResponse setBody(MarkMonitorAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkMonitorAccountsResponseBody getBody() {
        return this.body;
    }

}
