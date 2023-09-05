// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class RootCaCrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public String body;

    public static RootCaCrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RootCaCrlResponse self = new RootCaCrlResponse();
        return TeaModel.build(map, self);
    }

    public RootCaCrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RootCaCrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RootCaCrlResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
