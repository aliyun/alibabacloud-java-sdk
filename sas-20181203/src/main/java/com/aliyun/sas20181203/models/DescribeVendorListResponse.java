// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVendorListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVendorListResponseBody body;

    public static DescribeVendorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVendorListResponse self = new DescribeVendorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVendorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVendorListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVendorListResponse setBody(DescribeVendorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVendorListResponseBody getBody() {
        return this.body;
    }

}
