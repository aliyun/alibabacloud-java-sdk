// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorTrialConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudVendorTrialConfigResponseBody body;

    public static DescribeCloudVendorTrialConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorTrialConfigResponse self = new DescribeCloudVendorTrialConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorTrialConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudVendorTrialConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudVendorTrialConfigResponse setBody(DescribeCloudVendorTrialConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudVendorTrialConfigResponseBody getBody() {
        return this.body;
    }

}
