// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleApiProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConsoleApiProxyResponseBody body;

    public static ConsoleApiProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsoleApiProxyResponse self = new ConsoleApiProxyResponse();
        return TeaModel.build(map, self);
    }

    public ConsoleApiProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsoleApiProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsoleApiProxyResponse setBody(ConsoleApiProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsoleApiProxyResponseBody getBody() {
        return this.body;
    }

}
