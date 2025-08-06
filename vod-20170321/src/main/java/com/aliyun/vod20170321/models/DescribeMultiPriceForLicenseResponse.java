// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiPriceForLicenseResponseBody body;

    public static DescribeMultiPriceForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiPriceForLicenseResponse self = new DescribeMultiPriceForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiPriceForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiPriceForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiPriceForLicenseResponse setBody(DescribeMultiPriceForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiPriceForLicenseResponseBody getBody() {
        return this.body;
    }

}
