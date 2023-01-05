// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScriptResponseBody body;

    public static DescribeScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptResponse self = new DescribeScriptResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScriptResponse setBody(DescribeScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScriptResponseBody getBody() {
        return this.body;
    }

}
