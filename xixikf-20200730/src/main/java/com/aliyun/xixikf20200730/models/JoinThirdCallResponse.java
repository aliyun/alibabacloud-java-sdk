// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class JoinThirdCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JoinThirdCallResponseBody body;

    public static JoinThirdCallResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinThirdCallResponse self = new JoinThirdCallResponse();
        return TeaModel.build(map, self);
    }

    public JoinThirdCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinThirdCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinThirdCallResponse setBody(JoinThirdCallResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinThirdCallResponseBody getBody() {
        return this.body;
    }

}
