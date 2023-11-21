// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFailoverTestJobResponseBody body;

    public static DescribeFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailoverTestJobResponse self = new DescribeFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFailoverTestJobResponse setBody(DescribeFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
