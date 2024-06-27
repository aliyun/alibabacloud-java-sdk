// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckCustVariableLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCustVariableLimitResponseBody body;

    public static CheckCustVariableLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCustVariableLimitResponse self = new CheckCustVariableLimitResponse();
        return TeaModel.build(map, self);
    }

    public CheckCustVariableLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCustVariableLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCustVariableLimitResponse setBody(CheckCustVariableLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCustVariableLimitResponseBody getBody() {
        return this.body;
    }

}
