// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableHoneypotResponseBody body;

    public static ListAvailableHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableHoneypotResponse self = new ListAvailableHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableHoneypotResponse setBody(ListAvailableHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableHoneypotResponseBody getBody() {
        return this.body;
    }

}
