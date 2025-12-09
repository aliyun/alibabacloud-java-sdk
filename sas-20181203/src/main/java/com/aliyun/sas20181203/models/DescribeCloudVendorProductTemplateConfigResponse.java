// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorProductTemplateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudVendorProductTemplateConfigResponseBody body;

    public static DescribeCloudVendorProductTemplateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorProductTemplateConfigResponse self = new DescribeCloudVendorProductTemplateConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorProductTemplateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudVendorProductTemplateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudVendorProductTemplateConfigResponse setBody(DescribeCloudVendorProductTemplateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudVendorProductTemplateConfigResponseBody getBody() {
        return this.body;
    }

}
