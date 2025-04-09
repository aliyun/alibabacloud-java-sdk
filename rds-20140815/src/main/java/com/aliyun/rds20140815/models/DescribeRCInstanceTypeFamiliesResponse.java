// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypeFamiliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceTypeFamiliesResponseBody body;

    public static DescribeRCInstanceTypeFamiliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypeFamiliesResponse self = new DescribeRCInstanceTypeFamiliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypeFamiliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceTypeFamiliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceTypeFamiliesResponse setBody(DescribeRCInstanceTypeFamiliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceTypeFamiliesResponseBody getBody() {
        return this.body;
    }

}
