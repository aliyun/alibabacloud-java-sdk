// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class ConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public String body;

    public static ConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmResponse self = new ConfirmResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
