// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConsoleProxyResponseBody body;

    public static ConsoleProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsoleProxyResponse self = new ConsoleProxyResponse();
        return TeaModel.build(map, self);
    }

    public ConsoleProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsoleProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsoleProxyResponse setBody(ConsoleProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsoleProxyResponseBody getBody() {
        return this.body;
    }

}
