// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientProblemTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientProblemTypeResponseBody body;

    public static DescribeClientProblemTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientProblemTypeResponse self = new DescribeClientProblemTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientProblemTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientProblemTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientProblemTypeResponse setBody(DescribeClientProblemTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientProblemTypeResponseBody getBody() {
        return this.body;
    }

}
