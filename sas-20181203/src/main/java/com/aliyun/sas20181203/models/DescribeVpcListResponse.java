// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcListResponseBody body;

    public static DescribeVpcListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListResponse self = new DescribeVpcListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcListResponse setBody(DescribeVpcListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcListResponseBody getBody() {
        return this.body;
    }

}
