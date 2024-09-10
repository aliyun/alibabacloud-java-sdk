// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorAccountAKListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudVendorAccountAKListResponseBody body;

    public static DescribeCloudVendorAccountAKListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorAccountAKListResponse self = new DescribeCloudVendorAccountAKListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorAccountAKListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudVendorAccountAKListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudVendorAccountAKListResponse setBody(DescribeCloudVendorAccountAKListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudVendorAccountAKListResponseBody getBody() {
        return this.body;
    }

}
