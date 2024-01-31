// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertySoftwareDetailResponseBody body;

    public static DescribePropertySoftwareDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailResponse self = new DescribePropertySoftwareDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertySoftwareDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertySoftwareDetailResponse setBody(DescribePropertySoftwareDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertySoftwareDetailResponseBody getBody() {
        return this.body;
    }

}
