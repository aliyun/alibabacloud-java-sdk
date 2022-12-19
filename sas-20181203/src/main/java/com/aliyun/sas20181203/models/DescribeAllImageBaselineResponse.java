// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllImageBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
