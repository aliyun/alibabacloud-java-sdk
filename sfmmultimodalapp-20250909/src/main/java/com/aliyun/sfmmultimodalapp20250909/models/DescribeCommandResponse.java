// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DescribeCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommandResponseBody body;

    public static DescribeCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandResponse self = new DescribeCommandResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommandResponse setBody(DescribeCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommandResponseBody getBody() {
        return this.body;
    }

}
