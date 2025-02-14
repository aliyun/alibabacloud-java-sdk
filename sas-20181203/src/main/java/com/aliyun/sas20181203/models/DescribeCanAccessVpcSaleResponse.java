// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanAccessVpcSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCanAccessVpcSaleResponseBody body;

    public static DescribeCanAccessVpcSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanAccessVpcSaleResponse self = new DescribeCanAccessVpcSaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCanAccessVpcSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCanAccessVpcSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCanAccessVpcSaleResponse setBody(DescribeCanAccessVpcSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCanAccessVpcSaleResponseBody getBody() {
        return this.body;
    }

}
