// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectCaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListObjectCaseResponseBody body;

    public static PopListObjectCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectCaseResponse self = new PopListObjectCaseResponse();
        return TeaModel.build(map, self);
    }

    public PopListObjectCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListObjectCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListObjectCaseResponse setBody(PopListObjectCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListObjectCaseResponseBody getBody() {
        return this.body;
    }

}
