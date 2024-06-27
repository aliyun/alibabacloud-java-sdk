// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchQueryVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchQueryVariableResponseBody body;

    public static SwitchQueryVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchQueryVariableResponse self = new SwitchQueryVariableResponse();
        return TeaModel.build(map, self);
    }

    public SwitchQueryVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchQueryVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchQueryVariableResponse setBody(SwitchQueryVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchQueryVariableResponseBody getBody() {
        return this.body;
    }

}
