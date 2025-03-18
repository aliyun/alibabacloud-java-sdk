// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeVendorApiListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVendorApiListResponseBody body;

    public static DescribeVendorApiListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVendorApiListResponse self = new DescribeVendorApiListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVendorApiListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVendorApiListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVendorApiListResponse setBody(DescribeVendorApiListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVendorApiListResponseBody getBody() {
        return this.body;
    }

}
