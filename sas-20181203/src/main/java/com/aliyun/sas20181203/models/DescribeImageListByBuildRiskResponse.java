// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListByBuildRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageListByBuildRiskResponseBody body;

    public static DescribeImageListByBuildRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListByBuildRiskResponse self = new DescribeImageListByBuildRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageListByBuildRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageListByBuildRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageListByBuildRiskResponse setBody(DescribeImageListByBuildRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageListByBuildRiskResponseBody getBody() {
        return this.body;
    }

}
