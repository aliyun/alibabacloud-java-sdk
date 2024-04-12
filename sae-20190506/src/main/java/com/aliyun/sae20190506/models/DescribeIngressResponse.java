// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIngressResponseBody body;

    public static DescribeIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressResponse self = new DescribeIngressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIngressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIngressResponse setBody(DescribeIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIngressResponseBody getBody() {
        return this.body;
    }

}
