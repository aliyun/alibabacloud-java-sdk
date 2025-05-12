// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceSupportResponseBody body;

    public static CheckInstanceSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportResponse self = new CheckInstanceSupportResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceSupportResponse setBody(CheckInstanceSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceSupportResponseBody getBody() {
        return this.body;
    }

}
