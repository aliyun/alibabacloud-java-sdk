// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserAnalyzerResponseBody body;

    public static DescribeUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAnalyzerResponse self = new DescribeUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAnalyzerResponse setBody(DescribeUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
