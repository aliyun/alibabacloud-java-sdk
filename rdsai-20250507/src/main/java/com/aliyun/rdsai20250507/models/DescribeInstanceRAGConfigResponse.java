// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceRAGConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRAGConfigResponseBody body;

    public static DescribeInstanceRAGConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRAGConfigResponse self = new DescribeInstanceRAGConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRAGConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRAGConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRAGConfigResponse setBody(DescribeInstanceRAGConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRAGConfigResponseBody getBody() {
        return this.body;
    }

}
