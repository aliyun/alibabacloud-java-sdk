// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelUpdateStackResponseBody body;

    public static CancelUpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackResponse self = new CancelUpdateStackResponse();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUpdateStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelUpdateStackResponse setBody(CancelUpdateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUpdateStackResponseBody getBody() {
        return this.body;
    }

}
