// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnMarkMonitorAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnMarkMonitorAccountsResponseBody body;

    public static UnMarkMonitorAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnMarkMonitorAccountsResponse self = new UnMarkMonitorAccountsResponse();
        return TeaModel.build(map, self);
    }

    public UnMarkMonitorAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnMarkMonitorAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnMarkMonitorAccountsResponse setBody(UnMarkMonitorAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnMarkMonitorAccountsResponseBody getBody() {
        return this.body;
    }

}
