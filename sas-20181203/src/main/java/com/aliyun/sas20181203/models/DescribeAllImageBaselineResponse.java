// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllImageBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllImageBaselineResponseBody body;

    public static DescribeAllImageBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllImageBaselineResponse self = new DescribeAllImageBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllImageBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllImageBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllImageBaselineResponse setBody(DescribeAllImageBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllImageBaselineResponseBody getBody() {
        return this.body;
    }

}
