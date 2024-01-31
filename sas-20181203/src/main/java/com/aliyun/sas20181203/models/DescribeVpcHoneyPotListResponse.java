// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcHoneyPotListResponseBody body;

    public static DescribeVpcHoneyPotListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotListResponse self = new DescribeVpcHoneyPotListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcHoneyPotListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcHoneyPotListResponse setBody(DescribeVpcHoneyPotListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcHoneyPotListResponseBody getBody() {
        return this.body;
    }

}
