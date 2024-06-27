// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchVariableResponseBody body;

    public static SwitchVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchVariableResponse self = new SwitchVariableResponse();
        return TeaModel.build(map, self);
    }

    public SwitchVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchVariableResponse setBody(SwitchVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchVariableResponseBody getBody() {
        return this.body;
    }

}
