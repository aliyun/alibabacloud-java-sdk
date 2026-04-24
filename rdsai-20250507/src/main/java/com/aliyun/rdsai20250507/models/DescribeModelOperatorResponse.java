// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelOperatorResponseBody body;

    public static DescribeModelOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorResponse self = new DescribeModelOperatorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelOperatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelOperatorResponse setBody(DescribeModelOperatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelOperatorResponseBody getBody() {
        return this.body;
    }

}
