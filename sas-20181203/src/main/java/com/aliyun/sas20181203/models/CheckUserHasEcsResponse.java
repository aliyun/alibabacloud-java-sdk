// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckUserHasEcsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserHasEcsResponseBody body;

    public static CheckUserHasEcsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserHasEcsResponse self = new CheckUserHasEcsResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserHasEcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserHasEcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserHasEcsResponse setBody(CheckUserHasEcsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserHasEcsResponseBody getBody() {
        return this.body;
    }

}
