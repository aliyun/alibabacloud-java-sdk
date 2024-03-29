// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeQuickSaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQuickSaleConfigResponseBody body;

    public static DescribeQuickSaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuickSaleConfigResponse self = new DescribeQuickSaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQuickSaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQuickSaleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQuickSaleConfigResponse setBody(DescribeQuickSaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQuickSaleConfigResponseBody getBody() {
        return this.body;
    }

}
