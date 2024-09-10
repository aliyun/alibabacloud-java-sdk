// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanTrySasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCanTrySasResponseBody body;

    public static DescribeCanTrySasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanTrySasResponse self = new DescribeCanTrySasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCanTrySasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCanTrySasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCanTrySasResponse setBody(DescribeCanTrySasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCanTrySasResponseBody getBody() {
        return this.body;
    }

}
